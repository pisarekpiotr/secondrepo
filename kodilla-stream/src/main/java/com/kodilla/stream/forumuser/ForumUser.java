package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final int userSignature;
    private final String user;
    private final char sex ;
    private final LocalDate dateOfBirth;
    private final int posts;

    public ForumUser(int userSignature, String user, char sex, LocalDate dateOfBirth , int posts) {

        this.userSignature = userSignature;
        this.user = user;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.posts = posts;
    }


    public int getUserSignature() {
        return userSignature;
    }

    public String getUser() {
        return user;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getLocalDate() {
        return dateOfBirth;
    }

    public int getPosts() {
        return posts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userSignature=" + userSignature +
                ", user='" + user + '\'' +
                ", sex=" + sex +
                ", localDate=" + dateOfBirth +
                ", posts=" + posts +
                '}';
    }
}

