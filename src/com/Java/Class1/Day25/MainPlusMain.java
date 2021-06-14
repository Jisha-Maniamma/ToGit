package com.Java.Class1.Day25;

import java.time.LocalDate;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/06/02 15:22
 */
public class MainPlusMain {
    public static void main(String[] args) {
        //MainPlus MainPlus1=new MainPlus();
//        int Holiday=MainPlus.HOLIDAY_TYPE_SUNDAY_SATURDAY;
        try {
            ////////////////////////////////////////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////////////////////////////////////
            ////////////////////////////////////////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////////////////////////////////////

            System.out.println("\n\n\n\n");
            MainPlus.getInstance().Calculating_Task_dates("Project Osaka",MainPlus.HOLIDAY_TYPE_SUNDAY_SATURDAY, 1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                    1, 1, 1, 1, 1, 1, LocalDate.of(2021, 04, 19), 10, LocalDate.of(2021, 02, 19));
            System.out.println("\n\n\n\n************************************************* increasing the task size *********************************************************");
            MainPlus.getInstance().reduce_one_task1(5, MainPlus.CHANGE_TASK12, MainPlus.INCREASE);
            System.out.println("\n\n\n\n************************************************* reducing the task size *********************************************************");
            MainPlus.reduce_one_task1(8, MainPlus.CHANGE_TASK12, MainPlus.DECREASE);
            System.out.println("\n\n\n\n************************************************* shifting the task size *********************************************************");
            MainPlus.reduce_one_task1(8, MainPlus.CHANGE_TASK12, MainPlus.SHIFT);

            ////////////////////////////////////////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////////////////////////////////////
            ////////////////////////////////////////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////////////////////////////////////

//            System.out.println("\n\n\n\n");
//            MainPlus.getInstance().Calculating_Task_dates(MainPlus.HOLIDAY_TYPE_ONLY_SUNDAY, 1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
//                    1, 1, 1, 1, 1, 1, LocalDate.of(2021, 03, 19), 10, LocalDate.of(2021, 02, 19));
//            System.out.println("\n\n\n\n************************************************* shifting the task size *********************************************************");
//            MainPlus.reduce_one_task1(2, MainPlus.CHANGE_TASK10, MainPlus.SHIFT);
//            System.out.println("\n\n\n\n************************************************* increasing the task size *********************************************************");
//            MainPlus.getInstance().reduce_one_task1(5, MainPlus.CHANGE_TASK10, MainPlus.INCREASE);
//            System.out.println("\n\n\n\n************************************************* reducing the task size *********************************************************");
//            MainPlus.reduce_one_task1(8, MainPlus.CHANGE_TASK10, MainPlus.DECREASE);
            ////////////////////////////////////////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////////////////////////////////////
            ////////////////////////////////////////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////////////////////////////////////
            System.out.println("task values....");
            System.out.println("\n"+ MainPlus.getInstance().getBuffersize()+"\n"+MainPlus.getInstance().getTask12()+"\n"+MainPlus.getInstance().getTask11()+"\n"+MainPlus.getInstance().getTask10()
                    +"\n"+MainPlus.getInstance().getTask9()+"\n"+MainPlus.getInstance().getTask8()+"\n"+MainPlus.getInstance().getTask7()+"\n"+MainPlus.getInstance().getTask6()+"\n"
                    +MainPlus.getInstance().getTask5()+"\n"+MainPlus.getInstance().getTask4()+"\n"+MainPlus.getInstance().getTask3()+"\n"+MainPlus.getInstance().getTask2()+"\n"
                    +MainPlus.getInstance().getTask1());
            System.out.println("wait values......");
            System.out.println("\n"+ MainPlus.getInstance().getWait1()+"\n"+ MainPlus.getInstance().getWait2()+
                    "\n"+ MainPlus.getInstance().getWait3()+"\n"+ MainPlus.getInstance().getWait4()+
                    "\n"+ MainPlus.getInstance().getWait5()+"\n"+ MainPlus.getInstance().getWait6()+
                    "\n"+ MainPlus.getInstance().getWait7()+"\n"+ MainPlus.getInstance().getWait8()+
                    "\n"+ MainPlus.getInstance().getWait9()+"\n"+ MainPlus.getInstance().getWait10()+
                    "\n"+ MainPlus.getInstance().getWait11()+"\n"+ MainPlus.getInstance().getWait12());








            //planning values from the database

            //execution values from the database

            //update the execution value in the database



            //    System.out.println(-77/0.0);


        }
        catch (Exception e){
            System.out.println("ERRORRR!!!! "+e.getMessage());
        }
    }
}
