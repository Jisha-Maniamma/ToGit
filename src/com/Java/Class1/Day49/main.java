package com.Java.Class1.Day49;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws FileNotFoundException {
          System.out.println(LocalDate.of(2022,01,27).minusMonths(3).getMonthValue());

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        System.out.println(numbers);
        numbers.forEach((n)-> System.out.println(n));

        ListIterator<Integer> iterator=numbers.listIterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
        System.out.println("............");
        System.out.println(LocalDate.now().minusMonths(3).getMonthValue());
        Scanner scan = new Scanner(new File("X:\\01.IT開発\\4.福利厚生申込システム\\※開発development\\※データベースdatabase\\Initial_Database_Values_Ver1\\Personal_Usage_Results_Management_Details.csv"));

        scan.useDelimiter("\n");
        while(scan.hasNext()){
            String[] data=scan.nextLine().split(",");
            if(!data[1].equals("社員コード"))
                System.out.println((data[0] + "  "+ data[1]+ "  "+data[2]+ ""));
        }
        System.out.println(LocalDate.now().minusMonths(3).getMonthValue());

        while(scan.hasNext()) {
            String a=scan.nextLine();


//            String ab=a.split(",")[2];
//            System.out.println(ab.equals("1234"));
//            String[] a=scan.next().split(",");
//            if(! a[1].equals("社員名") ){
//
//                String aa=a[2];
//                System.out.println(aa);
//                equalsOrnot(aa,"J0007KS");
//
//            }


        }
        System.out.println("...................");
StringBuffer date=new StringBuffer("20220506").insert(4,"-").insert(7,"-");

        try{
             scan = new Scanner(new File("X:\\01.IT開発\\4.福利厚生申込システム\\※開発development\\※データベースdatabase\\Initial_Database_Values_Ver1\\Ticket‐O‐R‐T.csv"));
            scan.useDelimiter("\n");
            while (scan.hasNext()){

                String[] data=scan.nextLine().split(",");
                if(!data[0].equals("施設コード")){
                    System.out.println(data[0]);
                }

            }

        }catch (Exception e){
            System.out.println(e);
        }



        System.out.println();

       // System.out.println(date);
//        scan.close();
    }

    private static void equalsOrnot(String s, String s1) {
        System.out.println(s+" and "+s1);
       System.out.println(s.equals(s1));
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(obj);
        return super.equals(obj);
    }
}
