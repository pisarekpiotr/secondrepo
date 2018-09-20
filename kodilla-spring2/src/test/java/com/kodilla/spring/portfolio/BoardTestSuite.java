package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        TaskList taskList1 = board.getToDoList();
        taskList1.TaskList().add("Some task to do");
        System.out.println(taskList1);
        TaskList taskList2 = board.getDoneList();
        taskList2.TaskList().add("Some done task");
        System.out.println(taskList2);
        TaskList taskList3 = board.getInProgressList();
        taskList3.TaskList().add("Tasks in progress");
        System.out.println(taskList3);

    }
}
