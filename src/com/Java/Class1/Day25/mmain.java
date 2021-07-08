package com.Java.Class1.Day25;

import java.time.LocalDate;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/31 11:00
 */
public class mmain {
    //    static {
//        int num=Integer.parseInt("d",16);
//    }
    public static void main(String[] args) {
        //main main1=new main();
//        int Holiday=main.HOLIDAY_TYPE_SUNDAY_SATURDAY;
        try {
            ////////////////////////////////////////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////////////////////////////////////
            ////////////////////////////////////////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////////////////////////////////////

//            System.out.println("\n\n\n\n");
//            main.getInstance().Calculating_Task_dates(main.HOLIDAY_TYPE_SUNDAY_SATURDAY, 1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
//                    1, 1, 1, 1, 1, 1, LocalDate.of(2021, 04, 19), 10, LocalDate.of(2021, 02, 19));
//            System.out.println("\n\n\n\n************************************************* increasing the task size *********************************************************");
//            main.getInstance().reduce_one_task1(5, main.CHANGE_TASK12, main.INCREASE);
//            System.out.println("\n\n\n\n************************************************* reducing the task size *********************************************************");
//            main.reduce_one_task1(8, main.CHANGE_TASK12, main.DECREASE);
//            System.out.println("\n\n\n\n************************************************* shifting the task size *********************************************************");
//            main.reduce_one_task1(8, main.CHANGE_TASK12, main.SHIFT);

            ////////////////////////////////////////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////////////////////////////////////
            ////////////////////////////////////////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////////////////////////////////////

            System.out.println("\n\n\n\n");
            main.getInstance().Calculating_Task_dates(main.HOLIDAY_TYPE_ONLY_SUNDAY, 1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1,
                    1, 1, 1, 1, 1, 1, LocalDate.of(2021, 03, 19), 10, LocalDate.of(2021, 02, 19));
            System.out.println("\n\n\n\n************************************************* shifting the task size *********************************************************");
            main.reduce_one_task1(2, main.CHANGE_TASK10, main.SHIFT);
            System.out.println("\n\n\n\n************************************************* increasing the task size *********************************************************");
            main.getInstance().reduce_one_task1(5, main.CHANGE_TASK10, main.INCREASE);
            System.out.println("\n\n\n\n************************************************* reducing the task size *********************************************************");
            main.reduce_one_task1(8, main.CHANGE_TASK10, main.DECREASE);
            ////////////////////////////////////////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////////////////////////////////////
            ////////////////////////////////////////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////////////////////////////////////



            //    System.out.println(-77/0.0);


        }
        catch (Exception e){
            System.out.println("ERRORRR!!!! "+e.getMessage());
        }
    }
}
