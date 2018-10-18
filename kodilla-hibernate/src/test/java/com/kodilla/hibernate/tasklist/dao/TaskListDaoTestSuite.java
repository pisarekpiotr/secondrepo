package com.kodilla.hibernate.tasklist.dao;


import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListkDao;
    private static final String DESCRIPTION = "Test: Learn Hibernate v2";

    @Test
    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(DESCRIPTION, "New list");

        //When
        taskListkDao.save(taskList);

        //Then
        int id = taskList.getId();
        Optional<TaskList> readTask = taskListkDao.findById(id);
        Assert.assertEquals(id, readTask.get().getId());

        //CleanUp
        taskListkDao.deleteById(id);
    }
}
