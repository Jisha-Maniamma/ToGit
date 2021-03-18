package com.Java.Class1.Day11.Data;

import java.time.format.DateTimeFormatter;
import java.util.List;

public class ToDoData {
private static ToDoData instance=new ToDoData();
private static String FILE_NAME="TODO_Details.txt";

private List<ToDoItems> todoItems;
private DateTimeFormatter df;


public static  ToDoData getInstance(){
    return instance;
}

private  ToDoData(){
    df=DateTimeFormatter.ofPattern("dd-MM-yyyy");

}

    public List<ToDoItems> getTodoItems() {
        return todoItems;
    }

    public void setTodoItems(List<ToDoItems> todoItems) {
        this.todoItems = todoItems;
    }


}
