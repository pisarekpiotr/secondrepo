package com.kodilla.stream;

import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;
import java.time.LocalDate;
import java.util.Map;
import java.util.stream.Collectors;

public class main {

    public static void main(String[] args) {

        Forum theForum = new Forum();
        Map <String,ForumUser > theForumResults = theForum.getList().stream()
                .filter(ForumUser -> ForumUser.getSex() == 'M')
                //.filter(ForumUser -> ForumUser.getLocalDate().getYear() < LocalDate.of(2018,7,24).getYear() - 20)
                .filter(ForumUser -> ForumUser.getLocalDate().getYear() < LocalDate.now().getYear() - 20)
                .filter(ForumUser -> ForumUser.getPosts() > 1)
                .collect(Collectors.toMap(ForumUser::getUserSignature,Forum -> Forum));

        theForumResults.entrySet().stream()
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);

    }
}
