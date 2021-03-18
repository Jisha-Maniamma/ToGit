package com.Java.Class1.Day11.Data;

import java.time.LocalDate;

public class ToDoItems {

    private String taskName;
    private String personName;
    private LocalDate dateOfTask;


    public ToDoItems(String taskName, String personName, LocalDate dateOfTask) {
        this.taskName = taskName;
        this.personName = personName;
        this.dateOfTask = dateOfTask;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }

    public LocalDate getDateOfTask() {
        return dateOfTask;
    }

    public void setDateOfTask(LocalDate dateOfTask) {
        this.dateOfTask = dateOfTask;
    }
}
