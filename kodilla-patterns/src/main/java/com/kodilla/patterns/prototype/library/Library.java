package com.kodilla.patterns.prototype.library;

import com.kodilla.patterns.prototype.Prototype;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public final class Library extends Prototype {
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(final String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(name, library.name) &&
                Objects.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, books);
    }

    @Override
    public String toString() {
        String s = "Board [" + name + "]\n";
        for (Book list : books) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }

    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedBoard = (Library) super.clone();
        clonedBoard.books = new HashSet<>();
        for (Book theBookList : books) {
            Book clonedBooklist = new Book(theBookList.getTitle(), theBookList.getAuthor(), theBookList.getPublicationDate());

            clonedBoard.getBooks().add(clonedBooklist);
        }
        return clonedBoard;
    }
}
