package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;
import java.time.LocalDate;

public class LibraryTestSuite {

    @Test
    public void testGetBooks(){

        //Given
        Library newLibraryBookList = new Library("List one");

        Book book1 = new Book("Godfather", "Mario Puzo", LocalDate.of(1969,2,1));
        Book book2 = new Book("The Lord of the Rings", "J. R. R. Tolkien", LocalDate.of(1954,7,29));
        Book book3 = new Book("The Shining", " Stephen King", LocalDate.of(1977,5,14));
        Book book4 = new Book("Carrie", " Stephen King", LocalDate.of(1974,12,11));

        //When
        newLibraryBookList.getBooks().add(book1);
        newLibraryBookList.getBooks().add(book2);
        newLibraryBookList.getBooks().add(book3);
        newLibraryBookList.getBooks().add(book4);


        //making a shallow clone of object board
        Library clonedLibrary = null;
        try {
            clonedLibrary  = newLibraryBookList.shallowCopy();
            clonedLibrary.setName("Cloned list (List two)");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object board
        Library deepClonedBoard = null;
        try {
            deepClonedBoard = newLibraryBookList.deepCopy();
            deepClonedBoard.setName("Cloned from cloned list (List three)");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //Then
        System.out.println(clonedLibrary);
        System.out.println(newLibraryBookList);
        System.out.println(deepClonedBoard);
        Assert.assertEquals(4, newLibraryBookList.getBooks().size());
        Assert.assertEquals(4, clonedLibrary.getBooks().size());
        Assert.assertEquals(4, deepClonedBoard.getBooks().size());
    }
}
