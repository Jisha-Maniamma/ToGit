package com.Java.Class1.Day11.Data;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/03/18 11:45
 */
public class Main {
    public static void main(String[] args) {
stoop();
            ToDoItems item1 = new ToDoItems("Mail birthday card", "John",
                    LocalDate.of(2016, Month.APRIL, 25));
            ToDoItems item2 = new ToDoItems("Doctor's Appointment", "Jisha",
                    LocalDate.of(2016, Month.MAY, 23));
            ToDoItems item3 = new ToDoItems("Finish design proposal for client", "James",
                    LocalDate.of(2016, Month.APRIL, 22));
            ToDoItems item4 = new ToDoItems("Pickup Doug at the train station", "Jacob",
                    LocalDate.of(2016, Month.MARCH, 23));
            ToDoItems item5 = new ToDoItems("Pick up dry cleaning", "Ron",
                    LocalDate.of(2016, Month.APRIL,20));

        List<ToDoItems> toDoItems=new ArrayList<ToDoItems>();
toDoItems.add(item1);
        toDoItems.add(item2);
        toDoItems.add(item3);
        toDoItems.add(item4);
        toDoItems.add(item5);
ToDoData.getInstance().setTodoItems(toDoItems);
    }

    private static void stoop() {

        try{
            ToDoData.getInstance().storeToText();

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
