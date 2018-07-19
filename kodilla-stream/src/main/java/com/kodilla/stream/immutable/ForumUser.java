package com.kodilla.stream.immutable;

public class ForumUser {
    private final String userName;
    private final String realName;

    private ForumUser(final String userName, final String realName) {
        this.userName = userName;
        this.realName = realName;
    }

    private String getUserName() {
        return userName;
    }

    private String getRealName() {
        return realName;
    }
}

