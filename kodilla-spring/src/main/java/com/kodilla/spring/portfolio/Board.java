package com.kodilla.spring.portfolio;

public class Board {

    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    public Board(TaskList toDoList, TaskList inProgressList, TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    public void addTaskDoList(String task) {
        toDoList.addTasks(task);
    }

    public void addTaskInProgressList(String task) {
        inProgressList.addTasks(task);
    }

    public void addTaskToDoneList(String task) {
        doneList.addTasks(task);
    }

    public void display() {
        System.out.println("Tasks assigned to to-do list: " + String.join(" / ", toDoList.getTasksList()));
        System.out.println("Tasks assigned to in progress list: " + String.join(" / ", inProgressList.getTasksList()));
        System.out.println("Tasks assigned to done list: " + String.join(" / ", doneList.getTasksList()));
    }
}
