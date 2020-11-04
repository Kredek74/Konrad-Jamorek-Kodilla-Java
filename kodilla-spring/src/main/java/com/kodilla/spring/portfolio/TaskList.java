package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {

    List<String> tasks;

    public TaskList() {
        tasks = new ArrayList<>();
    }

    public List<String> getTasksList() {
        return tasks;
    }

    public void addTasks(String task) {
        tasks.add(task);
    }
}
