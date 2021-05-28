package com.Java.Class1.Day25;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/27 11:18
 */
public class main {
    private static double Task1;
    private static double Task2;
    private static double Task3;
    private static double Task4;
    private static double Task5;
    private static double Task6;
    private static double Task7;
    private static double Task8;
    private static double Task9;
    private static double Task10;
    private static double Task11;
    private static double Task12;


    private static double Wait1;
    private static double Wait2;
    private static double Wait3;
    private static double Wait4;
    private static double Wait5;
    private static double Wait6;
    private static double Wait7;
    private static double Wait8;
    private static double Wait9;
    private static double Wait10;
    private static double Wait11;
    private static double Wait12;
    private static double buffersize;
    private static LocalDate MilestoneDate,StartDate;
    /////////////////////////////////// LoadExistingUser1 user1=new LoadExistingUser1();
    private  LocalDate Buffer_Date;
    //,Wait1_Date,Wait2_Date,Wait3_Date,Wait4_Date,Wait5_Date,Wait6_Date,Wait7_Date,Wait8_Date,Wait9_Date,Wait10_Date,Wait11_Date,Wait12;
    private   LocalDate Task12_date,Task11_date,Task10_date,Task9_date,Task8_date,Task7_date,Task6_date
            ,Task5_date,Task4_date,Task3_date,Task2_date,Task1_date;
    private  LocalDate Wait12_date,Wait11_date,Wait10_date,Wait9_date,Wait8_date,Wait7_date,Wait6_date
            ,Wait5_date,Wait4_date,Wait3_date,Wait2_date,Wait1_date;

    public LocalDate getBuffer_Date() {
        return Buffer_Date;
    }

    public void setBuffer_Date(LocalDate buffer_Date) {
        Buffer_Date = buffer_Date;
    }

    public LocalDate getTask12_date() {
        return Task12_date;
    }

    public void setTask12_date(LocalDate task12_date) {
        Task12_date = task12_date;
    }

    public LocalDate getTask11_date() {
        return Task11_date;
    }

    public void setTask11_date(LocalDate task11_date) {
        Task11_date = task11_date;
    }

    public LocalDate getTask10_date() {
        return Task10_date;
    }

    public void setTask10_date(LocalDate task10_date) {
        Task10_date = task10_date;
    }

    public LocalDate getTask9_date() {
        return Task9_date;
    }

    public void setTask9_date(LocalDate task9_date) {
        Task9_date = task9_date;
    }

    public LocalDate getTask8_date() {
        return Task8_date;
    }

    public void setTask8_date(LocalDate task8_date) {
        Task8_date = task8_date;
    }

    public LocalDate getTask7_date() {
        return Task7_date;
    }

    public void setTask7_date(LocalDate task7_date) {
        Task7_date = task7_date;
    }

    public LocalDate getTask6_date() {
        return Task6_date;
    }

    public void setTask6_date(LocalDate task6_date) {
        Task6_date = task6_date;
    }

    public LocalDate getTask5_date() {
        return Task5_date;
    }

    public void setTask5_date(LocalDate task5_date) {
        Task5_date = task5_date;
    }

    public LocalDate getTask4_date() {
        return Task4_date;
    }

    public void setTask4_date(LocalDate task4_date) {
        Task4_date = task4_date;
    }

    public LocalDate getTask3_date() {
        return Task3_date;
    }

    public void setTask3_date(LocalDate task3_date) {
        Task3_date = task3_date;
    }

    public LocalDate getTask2_date() {
        return Task2_date;
    }

    public void setTask2_date(LocalDate task2_date) {
        Task2_date = task2_date;
    }

    public LocalDate getTask1_date() {
        return Task1_date;
    }

    public void setTask1_date(LocalDate task1_date) {
        Task1_date = task1_date;
    }

    public LocalDate getWait12_date() {
        return Wait12_date;
    }

    public void setWait12_date(LocalDate wait12_date) {
        Wait12_date = wait12_date;
    }

    public LocalDate getWait11_date() {
        return Wait11_date;
    }

    public void setWait11_date(LocalDate wait11_date) {
        Wait11_date = wait11_date;
    }

    public LocalDate getWait10_date() {
        return Wait10_date;
    }

    public void setWait10_date(LocalDate wait10_date) {
        Wait10_date = wait10_date;
    }

    public LocalDate getWait9_date() {
        return Wait9_date;
    }

    public void setWait9_date(LocalDate wait9_date) {
        Wait9_date = wait9_date;
    }

    public LocalDate getWait8_date() {
        return Wait8_date;
    }

    public void setWait8_date(LocalDate wait8_date) {
        Wait8_date = wait8_date;
    }

    public LocalDate getWait7_date() {
        return Wait7_date;
    }

    public void setWait7_date(LocalDate wait7_date) {
        Wait7_date = wait7_date;
    }

    public LocalDate getWait6_date() {
        return Wait6_date;
    }

    public void setWait6_date(LocalDate wait6_date) {
        Wait6_date = wait6_date;
    }

    public LocalDate getWait5_date() {
        return Wait5_date;
    }

    public void setWait5_date(LocalDate wait5_date) {
        Wait5_date = wait5_date;
    }

    public LocalDate getWait4_date() {
        return Wait4_date;
    }

    public void setWait4_date(LocalDate wait4_date) {
        Wait4_date = wait4_date;
    }

    public LocalDate getWait3_date() {
        return Wait3_date;
    }

    public void setWait3_date(LocalDate wait3_date) {
        Wait3_date = wait3_date;
    }

    public LocalDate getWait2_date() {
        return Wait2_date;
    }

    public void setWait2_date(LocalDate wait2_date) {
        Wait2_date = wait2_date;
    }

    public LocalDate getWait1_date() {
        return Wait1_date;
    }

    public void setWait1_date(LocalDate wait1_date) {
        Wait1_date = wait1_date;
    }

    /////////////////////////////////// private Date_Each_tasks instance=new Date_Each_tasks();
    public static void main(String[] args) {
        AddHolidays(LocalDate.of(2020,01,02) ,
                LocalDate.of(2020,01,02)
                ,LocalDate.of(2020,01,03)
                ,LocalDate.of(2020,05,04)
                ,LocalDate.of(2020,05,05)
                ,LocalDate.of(2020,05,06)
                ,LocalDate.of(2020,05,07)
                ,LocalDate.of(2020,05,8)
                ,LocalDate.of(2021,03,17)
                ,LocalDate.of(2021,03,18)
                ,LocalDate.of(2020,8,10)
                ,LocalDate.of(2020,8,11)
                ,LocalDate.of(2020,8,12)
                ,LocalDate.of(2020,8,13)
                ,LocalDate.of(2020,8,14)
                ,LocalDate.of(2020,9,21)
                ,LocalDate.of(2020,12,30)
                ,LocalDate.of(2020,12,31)

        );

        new main().Calculating_Task_dates(1,2,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,
                1,1,1,1,1,1,LocalDate.of(2021,04,19),10,LocalDate.of(2021,02,19));

//        new main().Calculating_Task_dates(0,2,3,1,0,0,0,0,0,0,0,0,1,1,1,1,1,0,
//                0,0,0,0,0,0,LocalDate.of(2021,04,19),10);

        //Shift_By_push(1);
        System.out.println("************************************************* increasing the task size *************************");
        reduce_one_task1(5,"Task12","Increase");
        System.out.println("************************************************* reducing the task size *************************");
        reduce_one_task1(1,"Task12","");
        System.out.println("************************************************* reducing the task size *************************");
        reduce_one_task1(8,"Task12","");
    }
    private static main m=new main();
    private static main getInstance(){
        return m;

    }
    private static void reduce_one_task1(int i,String taskName,String IncreaseOrDecrease) {
        try{
            System.out.println();
            System.out.println("///////////////////////////////////////////////////////////////////////////");
            System.out.println("///////////////////////////////////////////////////////////////////////////");
            switch(taskName){
                case "Buffer":
                    System.out.println("Buffer size is fixed");
                    break;
                case "Task12":
                    System.out.println();
                    if(IncreaseOrDecrease.equals("Increase")){
//                       getInstance().Calculating_Task_dates(0,2,3,1,0,0,0,0,0,0,0,0,1,1,1,1,1,0,
//                                0,0,0,0,0,0+i,LocalDate.of(2021,04,19),10);
                        getInstance().Calculating_Task_dates(Task1,Task2,Task3,Task4,Task5,Task6,Task7,Task8,Task9,Task10,Task11,Task12+i,Wait1,Wait2,Wait3,Wait4,Wait5,Wait6,
                                Wait7,Wait8,Wait9,Wait10,Wait11,Wait12,MilestoneDate,buffersize,StartDate);
                        break;
                    }
                    getInstance().Calculating_Task_dates(Task1,Task2,Task3,Task4,Task5,Task6,Task7,Task8,Task9,Task10,Task11,Task12-i,Wait1,Wait2,Wait3,Wait4,Wait5,Wait6,
                            Wait7,Wait8,Wait9,Wait10,Wait11,Wait12,MilestoneDate,buffersize,StartDate);
                    break;
                case "Wait12":
                    System.out.println("Wait12 start date is");
                    break;
                case "Task11":
                    System.out.println();
                    break;
                case "Wait11":
                    System.out.println();
                    break;
                case "Task10":
                    System.out.println();
                    break;
                case "Wait10":
                    System.out.println();
                    break;
                case "Task9":
                    System.out.println();
                    break;
                case "Wait9":
                    System.out.println();
                    break;
                case "Task8":
                    System.out.println();
                    break;
                case "Wait8":
                    System.out.println();
                    break;
                case "Task7":
                    System.out.println();
                    break;
                case "Wait7":
                    System.out.println();
                    break;
                case "Task6":
                    System.out.println();
                    break;
                case "Wait6":
                    System.out.println();
                    break;
                case "Task5":
                    System.out.println();
                    break;
                case "Wait5":
                    System.out.println();
                    break;
                case "Task4":
                    System.out.println();
                    break;
                case "Wait4":
                    System.out.println();
                    break;
                case "Task3":
                    System.out.println();
                    break;
                case "Wait3":
                    System.out.println();
                    break;
                case "Task2":
                    System.out.println();
                    break;
                case "Wait2":
                    System.out.println();
                    break;
                case "Task1":
                    System.out.println();
                    break;
                case "Wait1":
                    System.out.println();
                    break;
                default:
                    System.out.println("ERROR!!! not a valid change!!!");



            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println("///////////////////////////////////////////////////////////////////////////");
        System.out.println("///////////////////////////////////////////////////////////////////////////");
    }




//    private static void Shift_By_push(int i) {
//        System.out.println("************************************After push************************************");
//        new main().Calculating_Task_dates(0+i,2+i,3+i,1+i,0+i,0+i,0+i,0+i,0+i,0+i,0+i,0+i,1+i,1+i,1+i,1+i,1+i,0+i,
//                0+i,0+i,0+i,0+i,0+i,0+i,LocalDate.of(2021,04,19),10);
//    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void Calculating_Task_dates(double TTask1, double TTask2, double TTask3, double TTask4, double TTask5, double TTask6, double TTask7
            , double TTask8, double TTask9, double TTask10, double TTask11, double TTask12, double Waitt1, double Waitt2, double Waitt3
            , double Waitt4, double Waitt5, double Waitt6, double Waitt7, double Waitt8, double Waitt9, double Waitt10, double Waitt11, double Waitt12,
                                       LocalDate MilestoneDaate, double bufffersize,LocalDate StartDaate){

        this.Task1=TTask1;
        this.Task2=TTask2;
        this.Task3=TTask3;
        this.Task4=TTask4;
        this.Task5=TTask5;
        this.Task6=TTask6;
        this.Task7=TTask7;
        this.Task8=TTask8;
        this.Task9=TTask9;
        this.Task10=TTask10;
        this.Task11=TTask11;
        this.Task12=TTask12;

        this.Wait1=Waitt1;
        this.Wait2=Waitt2;
        this.Wait3=Waitt3;
        this.Wait4=Waitt4;
        this.Wait5=Waitt5;
        this.Wait6=Waitt6;
        this.Wait7=Waitt7;
        this.Wait8=Waitt8;
        this.Wait9=Waitt9;
        this.Wait10=Waitt10;
        this.Wait11=Waitt11;
        this.Wait12=Waitt12;
        this.buffersize=bufffersize;
        this.MilestoneDate=MilestoneDaate;
        this.StartDate=StartDaate;
//        System.out.println(MilestoneDate);
//        System.out.println(buffersize);
//        System.out.println(StartDate+" "+Wait1);

        Buffer_Date=calcul(1,MilestoneDate,buffersize);

        Wait1_date=calcul_Next_Date_Forward(1,StartDate,Wait1);





        Task1_date=calcul_Next_Date_Forward(1,Wait1_date,Task1);
        Wait2_date=calcul_Next_Date_Forward(1,Task1_date,Wait2);
        Task2_date=calcul_Next_Date_Forward(1,Wait2_date,Task2);
        Wait3_date=calcul_Next_Date_Forward(1,Task2_date,Wait3);
        Task3_date=calcul_Next_Date_Forward(1,Wait3_date,Task3);
        Wait4_date=calcul_Next_Date_Forward(1,Task3_date,Wait4);
        Task4_date=calcul_Next_Date_Forward(1,Wait4_date,Task4);
        Wait5_date=calcul_Next_Date_Forward(1,Task4_date,Wait5);
        Task5_date=calcul_Next_Date_Forward(1,Wait5_date,Task5);
        Wait6_date=calcul_Next_Date_Forward(1,Task5_date,Wait6);
        Task6_date=calcul_Next_Date_Forward(1,Wait6_date,Task6);
        Wait7_date=calcul_Next_Date_Forward(1,Task6_date,Wait7);
        Task7_date=calcul_Next_Date_Forward(1,Wait7_date,Task7);
        Wait8_date=calcul_Next_Date_Forward(1,Task7_date,Wait8);
        Task8_date=calcul_Next_Date_Forward(1,Wait8_date,Task8);
        Wait9_date=calcul_Next_Date_Forward(1,Task8_date,Wait9);
        Task9_date=calcul_Next_Date_Forward(1,Wait9_date,Task9);
        Wait10_date=calcul_Next_Date_Forward(1,Task9_date,Wait10);
        Task10_date=calcul_Next_Date_Forward(1,Wait10_date,Task10);
        Wait11_date=calcul_Next_Date_Forward(1,Task10_date,Wait11);
        Task11_date=calcul_Next_Date_Forward(1,Wait11_date,Task11);
        Wait12_date=calcul_Next_Date_Forward(1,Task11_date,Wait12);
        Task12_date=(Task12>=0)?calcul_Next_Date_Forward(1,Wait12_date,Task12):Wait12_date;



















        System.out.println();
        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println("Milestone date......"+".... "+MilestoneDate);
        System.out.println("Buffer end date.......... "+MilestoneDate);System.out.println("Buffer start date......"+buffersize+".... "+Buffer_Date);
        System.out.println("Task12 end date......"+Task12+".... "+Task12_date);System.out.println("Task12 start date.......... "+Wait12_date);
        System.out.println("wait12 end date......"+Wait12+".... "+Wait12_date);System.out.println("wait12 start date.......... "+Task11_date);
        System.out.println("Task11 end date......"+Task11+".... "+Task11_date);System.out.println("Task11 start date.......... "+Wait11_date);
        System.out.println("wait11 end date......"+Wait11+".... "+Wait11_date);System.out.println("wait11 start date.......... "+Task10_date);
        System.out.println("Task10 end date......"+Task10+".... "+Task10_date);System.out.println("Task10 start date.......... "+Wait10_date);
        System.out.println("wait10 end date......"+Wait10+".... "+Wait10_date);System.out.println("wait10 start date.......... "+Task9_date);
        System.out.println("Task9 end date......"+Task9+".... "+Task9_date);System.out.println("Task9 start date.......... "+Wait9_date);
        System.out.println("wait9 end date......"+Wait9+".... "+Wait9_date);System.out.println("wait9 start date.......... "+Task8_date);
        System.out.println("Task8 end date......"+Task8+".... "+Task8_date);System.out.println("Task8 start date.......... "+Wait8_date);
        System.out.println("wait8 end date......"+Wait8+".... "+Wait8_date);System.out.println("wait8 start date.......... "+Task7_date);
        System.out.println("Task7 end date......"+Task7+".... "+Task7_date);System.out.println("Task7 start date.......... "+Wait7_date);
        System.out.println("wait7 end date......"+Wait7+".... "+Wait7_date);System.out.println("wait7 start date.......... "+Task6_date);
        System.out.println("Task6 end date......"+Task6+".... "+Task6_date);System.out.println("Task6 start date.......... "+Wait6_date);
        System.out.println("wait6 end date......"+Wait6+".... "+Wait6_date);System.out.println("wait6 start date.......... "+Task5_date);
        System.out.println("Task5 end date......"+Task5+".... "+Task5_date);System.out.println("Task5 start date.......... "+Wait5_date);
        System.out.println("wait5 end date......"+Wait5+".... "+Wait5_date);System.out.println("wait5 start date.......... "+Task4_date);
        System.out.println("Task4 end date......"+Task4+".... "+Task4_date);System.out.println("Task4 start date.......... "+Wait4_date);
        System.out.println("wait4 end date......"+Wait4+".... "+Wait4_date);System.out.println("wait4 start date.......... "+Task3_date);
        System.out.println("Task3 end date......"+Task3+".... "+Task3_date);System.out.println("Task3 start date.......... "+Wait3_date);
        System.out.println("wait3 end date......"+Wait3+".... "+Wait3_date);System.out.println("wait3 start date.......... "+Task2_date);
        System.out.println("Task2 end date......"+Task2+".... "+Task2_date);System.out.println("Task2 start date.......... "+Wait2_date);
        System.out.println("wait2 end date......"+Wait2+".... "+Wait2_date);System.out.println("wait2 start date.......... "+Wait2_date);
        System.out.println("Task1 end date......"+Task1+".... "+Task1_date);System.out.println("Task1 start date.......... "+Wait1_date);
        System.out.println("wait1 end date......"+Wait1+".... "+Wait1_date);System.out.println("wait1 start date.......... "+StartDate);


        System.out.println(" || ");
        System.out.println("*************************************");
        System.out.println("*************************************");
        System.out.println();
//DataSource.getDatasource().PlanningResource10;







    }
    //
    private static boolean ContainsOr(LocalDate date){
        for(LocalDate h:dates){
            //  System.out.println("******"+h+"******");
            if(h.getYear()==date.getYear() && h.getDayOfYear()==date.getDayOfYear()){
                // System.out.println("........holiday......"+date);
                return true;}
        }
        return false;
    }
    private static LocalDate calcul_Next_Date_Forward(int choice, LocalDate Enddate, double i) {
        LocalDate end=Enddate;
        double days=i;
        //System.out.println(i);
        //  System.out.println("...To reduce.... no. of date: "+days+"..... From Milestone date: "+end+"...");
        // System.out.println("Number of holidays "+dates.size());
        switch (choice){
            case 1:
                System.out.println("case 1");

                //sunday and saturday
                for(int ii=0;ii<=days;){
                    if(!(ContainsOr(end) ||end.getDayOfWeek()== DayOfWeek.SATURDAY || end.getDayOfWeek()==DayOfWeek.SUNDAY)){
//                        System.out.println("not weekend " +end +" "+end.getDayOfWeek());
//                        System.out.println(end);
                        ii++;
                        if(ii==days+1){
                            return end;
                        }
                    }
                    end=end.plusDays(1);
                }
                break;
            case 2:
                System.out.println("case 2");
                //only sunday
                for(int ii=0;ii<=days;){
                    if(!(ContainsOr(end)|| end.getDayOfWeek()==DayOfWeek.SUNDAY) ){
                       // System.out.println("its Holiday "+end +" "+end.getDayOfWeek());
//                        System.out.println("not weekend " +end+" "+end.getDayOfWeek());
                        ii++;
                        if(ii==days+1){
                            return end;
                        }
                    }
                    end=end.plusDays(1);
                }
                end= end.plusDays(1);
                break;
            case 3:
                //random
                System.out.println("Case 3");
                for(int ii=0;ii<=days;){
                    if(! ContainsOr(end) ){
                      //  System.out.println("its Holiday "+end +" "+end.getDayOfWeek());
//                        System.out.println("not weekend " +end+" "+end.getDayOfWeek());
                        ii++;
                        if(ii==days+1){
                            return end;
                        }
                    }
                    end=end.plusDays(1);
                }
                end= end.plusDays(1);
                break;
        }
        return end;
    }

    private static LocalDate calcul(int choice,LocalDate Enddate, double i) {
        LocalDate end=Enddate;
        double days=i;
        //  System.out.println("...To reduce.... no. of date: "+days+"..... From Milestone date: "+end+"...");
        // System.out.println("Number of holidays "+dates.size());
        switch (choice){
            case 1:
                System.out.println("case 1");

                //sunday and saturday
                for(int ii=0;ii<=days;){

                    if(ContainsOr(end) ||end.getDayOfWeek()== DayOfWeek.SATURDAY || end.getDayOfWeek()==DayOfWeek.SUNDAY ){
//                        System.out.println("its Holiday "+end +" "+end.getDayOfWeek());
                        end=end.minusDays(1);
                    }
                    else{
                        //  System.out.println("not weekend " +end +" "+end.getDayOfWeek());
                        end=end.minusDays(1);
                        ii++;
                    }
                    //System.out.println("calculating count ..."+ii);
                }
                end=end.plusDays(1);
                break;
            case 2:
                System.out.println("case 2");
                //only sunday
                for(int ii=0;ii<=days;){
                    if(ContainsOr(end)|| end.getDayOfWeek()==DayOfWeek.SUNDAY ){
                        // System.out.println("Weekend "+end);
//                        System.out.println("its Holiday "+end +" "+end.getDayOfWeek());
                        end=end.minusDays(1);

                    }
                    else{
                        // System.out.println("not weekend " +end);
                        end=end.minusDays(1);
                        ii++;
                    }
                }
                end= end.plusDays(1);
                break;
            case 3:
                //random
                System.out.println("Case 3");
                for(int ii=0;ii<=days;){
                    if(ContainsOr(end) ){
//                        System.out.println("its Holiday "+end +" "+end.getDayOfWeek());
                        end=end.minusDays(1);
                    }
                    else{
                        //  System.out.println("not weekend " +end);
                        end=end.minusDays(1);
                        ii++;
                    }
                }
                end= end.plusDays(1);
                break;
        }
        return end;
    }

    public static List<LocalDate> dates=new ArrayList<>();
    public static List<LocalDate> AddHolidays(LocalDate... datesInput){
        for(LocalDate NewDates:datesInput){
            dates.add(NewDates);
        }
        return dates;
    }

    public double getBuffersize() {
        return buffersize;
    }

    public void setBuffersize(double buffersize) {
        this.buffersize = buffersize;
    }

    public LocalDate getMilestoneDate() {
        return MilestoneDate;
    }

    public void setMilestoneDate(LocalDate milestoneDate) {
        MilestoneDate = milestoneDate;
    }

    public double getTask1() {
        return Task1;
    }

    public void setTask1(double task1) {
        Task1 = task1;
    }

    public double getTask2() {
        return Task2;
    }

    public void setTask2(double task2) {
        Task2 = task2;
    }

    public double getTask3() {
        return Task3;
    }

    public void setTask3(double task3) {
        Task3 = task3;
    }

    public double getTask4() {
        return Task4;
    }

    public void setTask4(double task4) {
        Task4 = task4;
    }

    public double getTask5() {
        return Task5;
    }

    public void setTask5(double task5) {
        Task5 = task5;
    }

    public double getTask6() {
        return Task6;
    }

    public void setTask6(double task6) {
        Task6 = task6;
    }

    public double getTask7() {
        return Task7;
    }

    public void setTask7(double task7) {
        Task7 = task7;
    }

    public double getTask8() {
        return Task8;
    }

    public void setTask8(double task8) {
        Task8 = task8;
    }

    public double getTask9() {
        return Task9;
    }

    public void setTask9(double task9) {
        Task9 = task9;
    }

    public double getTask10() {
        return Task10;
    }

    public void setTask10(double task10) {
        Task10 = task10;
    }

    public double getTask11() {
        return Task11;
    }

    public void setTask11(double task11) {
        Task11 = task11;
    }

    public double getTask12() {
        return Task12;
    }

    public void setTask12(double task12) {
        Task12 = task12;
    }

    public double getWait1() {
        return Wait1;
    }

    public void setWait1(double wait1) {
        Wait1 = wait1;
    }

    public double getWait2() {
        return Wait2;
    }

    public void setWait2(double wait2) {
        Wait2 = wait2;
    }

    public double getWait3() {
        return Wait3;
    }

    public void setWait3(double wait3) {
        Wait3 = wait3;
    }

    public double getWait4() {
        return Wait4;
    }

    public void setWait4(double wait4) {
        Wait4 = wait4;
    }

    public double getWait5() {
        return Wait5;
    }

    public void setWait5(double wait5) {
        Wait5 = wait5;
    }

    public double getWait6() {
        return Wait6;
    }

    public void setWait6(double wait6) {
        Wait6 = wait6;
    }

    public double getWait7() {
        return Wait7;
    }

    public void setWait7(double wait7) {
        Wait7 = wait7;
    }

    public double getWait8() {
        return Wait8;
    }

    public void setWait8(double wait8) {
        Wait8 = wait8;
    }

    public double getWait9() {
        return Wait9;
    }

    public void setWait9(double wait9) {
        Wait9 = wait9;
    }

    public double getWait10() {
        return Wait10;
    }

    public void setWait10(double wait10) {
        Wait10 = wait10;
    }

    public double getWait11() {
        return Wait11;
    }

    public void setWait11(double wait11) {
        Wait11 = wait11;
    }

    public double getWait12() {
        return Wait12;
    }

    public void setWait12(double wait12) {
        Wait12 = wait12;
    }
}
