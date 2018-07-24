package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List <ForumUser> theForumUserList = new ArrayList<>();

    public Forum() {
        theForumUserList.add(new ForumUser(123456,"Piotr", 'M', LocalDate.of(1981,1,3),1236));
        theForumUserList.add(new ForumUser(123457,"Magda", 'F', LocalDate.of(2002,7,14),1253));
        theForumUserList.add(new ForumUser(123458,"Jan", 'M', LocalDate.of(1991,6,25),1123));
        theForumUserList.add(new ForumUser(123459,"Ula", 'F', LocalDate.of(2001,8,6),1213));
        theForumUserList.add(new ForumUser(123460,"Joachim", 'M', LocalDate.of(1967,12,7),13));
        theForumUserList.add(new ForumUser(123461,"Andrzej", 'M', LocalDate.of(1992,12,12),33));
//        theBookList.add(new Book("Dylan Murphy", "Wolf of the mountain",
//                2003, "0001"));
//        theBookList.add(new Book("Phoebe Pearson", "Slaves of dreams",
//                2012, "0002"));
//        theBookList.add(new Book("Morgan Walsh", "Obliteration of heaven",
//                2001, "0003"));
//        theBookList.add(new Book("Aimee Murphy", "Rejecting the night",
//                2015, "0004"));
//        theBookList.add(new Book("Ryan Talley", "Gangsters and kings",
//                2007, "0005"));
//        theBookList.add(new Book("Madelynn Carson", "Unity without duty",
//                2007, "0006"));
//        theBookList.add(new Book("Giancarlo Guerrero", "Enemies of eternity",
//                2009, "0007"));
    }

    public List<ForumUser> getList() {
        return new ArrayList<>(theForumUserList);
    }
}
