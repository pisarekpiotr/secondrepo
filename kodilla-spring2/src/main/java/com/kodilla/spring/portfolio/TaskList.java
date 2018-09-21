package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<String> tasks;

    public List TaskList() {
        this.tasks = new ArrayList<>();
        return tasks;
    }

    @Override
    public String toString() {
        return "TaskList {" +
                "tasks = " + tasks +
                '}';
    }
}
