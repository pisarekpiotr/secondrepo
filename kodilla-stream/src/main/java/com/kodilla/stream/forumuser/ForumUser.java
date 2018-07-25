package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {

    private final String userSignature;
    private final String user;
    private final char sex ;
    private final LocalDate dateOfBirth;
    private final int posts;

    public ForumUser(final String userSignature, final String user, final char sex, final LocalDate dateOfBirth ,final int posts) {

        this.userSignature = userSignature;
        this.user = user;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.posts = posts;
    }


    public String getUserSignature() {
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

