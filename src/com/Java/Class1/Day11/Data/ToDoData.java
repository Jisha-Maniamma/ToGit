package com.Java.Class1.Day11.Data;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.format.DateTimeFormatter;
import java.util.Iterator;
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

    ///to load text
    public void LoadFromText(){


    }
    //to save to text
    public void storeToText() throws IOException {
        Path path= Paths.get(FILE_NAME);
        BufferedWriter bw= Files.newBufferedWriter(path);
        try{
            Iterator<ToDoItems> iter=todoItems.iterator();
                    while(iter.hasNext())
                    {
                        ToDoItems items=iter.next();
                        bw.write(String.format("%s, %s, %s", items.getPersonName()
                        , items.getTaskName(), items.getDateOfTask().format(df)));
                        bw.newLine();
                    }
        }finally{
            if(bw!=null){
                bw.close();
            }
        }
//        catch( Exception e){
//            System.out.println(e.getMessage());
//        }


    }


}
