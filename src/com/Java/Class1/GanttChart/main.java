package com.Java.Class1.GanttChart;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class main {

    private static LocalDate Task1_start,Task2_start,Task3_start,Task4_start,Task5_start,Task6_start,Task7_start,Task8_start,Task9_start,Task10_start,Task11_start,Task12_start;
    private static LocalDate Wait1_start,Wait2_start,Wait3_start,Wait4_start,Wait5_start,Wait6_start,Wait7_start,Wait8_start,Wait9_start,Wait10_start,Wait11_start,Wait12_start;
    private static LocalDate Task1_end,Task2_end,Task3_end,Task4_end,Task5_end,Task6_end,Task7_end,Task8_end,Task9_end,Task10_end,Task11_end,Task12_end;
    private static LocalDate Wait1_end,Wait2_end,Wait3_end,Wait4_end,Wait5_end,Wait6_end,Wait7_end,Wait8_end,Wait9_end,Wait10_end,Wait11_end,Wait12_end;
    public static  List<LocalDate> dates=new ArrayList<>();
    private static LocalDate start=LocalDate.parse("2022-02-04");
    public static final LocalDate [] holidays={LocalDate.parse("2021-01-01"), LocalDate.parse("2021-01-02"),LocalDate.parse("2021-01-04"),
            LocalDate.parse("2021-02-11"),LocalDate.parse("2021-02-23"),LocalDate.parse("2021-01-11"),LocalDate.parse("2021-03-20"),
            LocalDate.parse("2021-04-29"),LocalDate.parse("2021-05-03"),
            LocalDate.parse("2021-05-04"),LocalDate.parse("2021-05-05"),LocalDate.parse("2021-07-22"),LocalDate.parse("2021-07-23"),
            LocalDate.parse("2021-08-09"),LocalDate.parse("2021-09-20"),LocalDate.parse("2021-09-23"),LocalDate.parse("2021-11-03"),
            LocalDate.parse("2021-11-23"),LocalDate.parse("2022-01-03"),LocalDate.parse("2022-01-04"),LocalDate.parse("2021-02-03")};

    public static void main(String[] args) throws IOException {

        String s="2022-02-25 15:29";
        LocalDate d=LocalDate.parse(s.substring(0,10));
        System.out.println(d);

        //wait,task
        int[] pj1=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};//all value
        int[] pj2=new int[]{1,2,3,0,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};//task zero
        int[] pj3=new int[]{1,2,0,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};//wait zero
        int[] pj4=new int[]{1,2,0,0,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24};//wait task zero
        int[] pj5=new int[]{0,0,0,3,2,29,0,3,1,3,5,3,5,0,0,0,0,0,0,0,0,0,0};//otaguoSan
        int[] pj6=new int[]{0,5,0,10,3,5,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};//me

        int[][] projects={pj1,pj2,pj3,pj4};


        Calculating_Task_dates("pj1",1,
                projects[0][1],projects[0][3],projects[0][5],projects[0][7],projects[0][9],projects[0][11],projects[0][13],projects[0][15],projects[0][17],projects[0][19],projects[0][21],projects[0][23],
                projects[0][0],projects[0][2],projects[0][4],projects[0][6],projects[0][8],projects[0][10],projects[0][12],projects[0][14],projects[0][16],projects[0][18],projects[0][20],projects[0][22],
                LocalDate.now(),
                0,
                start
        );

        File f=new File("C:/Users/J0119/Documents/Jisha_Maniamma/names.txt");
        if(f.exists())
        {
            BufferedReader reader=new BufferedReader(new FileReader("C:/Users/J0119/Documents/Jisha_Maniamma/names.txt"));
//            if(linreader.readLine()){
//
//            }
        }

    }

    public static void Calculating_Task_dates(String projctname, int cchoice, double TTask1, double TTask2, double TTask3, double TTask4, double TTask5, double TTask6, double TTask7
            , double TTask8, double TTask9, double TTask10, double TTask11, double TTask12, double Waitt1, double Waitt2, double Waitt3
            , double Waitt4, double Waitt5, double Waitt6, double Waitt7, double Waitt8, double Waitt9, double Waitt10, double Waitt11, double Waitt12,
                                       LocalDate MilestoneDaate, double bufffersize, LocalDate StartDaate)  {


//      LocalDate date;
//
//      date=Waitt1>0?calcul_Next_Date_Forward(cchoice,start,Waitt1):null;
//
//        Wait1_start=date==null?null:start;
//        Wait1_end=date;





    }

    private static LocalDate calcul_Next_Date_Forward(int cchoice, LocalDate start, double taskvalue) {
        return null;
    }

}
