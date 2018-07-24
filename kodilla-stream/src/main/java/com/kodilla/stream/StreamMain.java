package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;

import java.time.LocalDate;
import java.time.Period;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {

    public static void main(String[] args) {

        Forum theForum = new Forum();
        String theForumResults = theForum.getList().stream()
              //  .filter(ForumUser -> ForumUser.getSex() == "M")
        .filter(ForumUser -> ForumUser.getLocalDate().getYear() < LocalDate.of(2018,7,24).getYear() - 20)
                .filter(ForumUser -> ForumUser.getPosts() > 1)
                .map(ForumUser::toString)
                .collect(Collectors.joining(",\n","<<",">>"));

        System.out.println(theForumResults);


    }
}