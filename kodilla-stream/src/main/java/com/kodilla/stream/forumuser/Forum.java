package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List <ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser("123456","Piotr", 'M', LocalDate.of(1981,1,3),1236));
        theForumUserList.add(new ForumUser("123457","Magda", 'F', LocalDate.of(2002,7,14),1253));
        theForumUserList.add(new ForumUser("123458","Jan", 'M', LocalDate.of(1991,6,25),1123));
        theForumUserList.add(new ForumUser("123459","Ula", 'F', LocalDate.of(2001,8,6),1213));
        theForumUserList.add(new ForumUser("123460","Joachim", 'M', LocalDate.of(1967,12,7),13));
        theForumUserList.add(new ForumUser("123461","Andrzej", 'M', LocalDate.of(1992,12,12),33));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUserList);
    }
}
