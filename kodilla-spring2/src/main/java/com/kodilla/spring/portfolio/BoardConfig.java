package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDoList")
    TaskList toDoList;

   @Autowired
   @Qualifier("inProgressList")
   TaskList inProgressList;

    @Autowired
    @Qualifier("doneList")
    TaskList doneList;

    @Bean(name = "toDoList")
    @Scope("prototype")
    TaskList toDoList() {
        return new TaskList();
    }

    @Bean(name = "inProgressList")
    @Scope("prototype")
    TaskList taskListInProgress() {
        return new TaskList();
    }

   @Bean(name = "doneList")
    @Scope("prototype")
    TaskList taskListDone() {
       return new TaskList();
    }

    @Bean
    public Board board() {
        return new Board(toDoList,inProgressList,doneList);
    }

}
