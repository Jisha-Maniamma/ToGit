package com.Java.Class1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class jisha_ccpm1 {


    public static void main(String[] args) {
        List<LocalDate> dates=new ArrayList<>();
        dates.clear();
        dates.add(LocalDate.parse("2022-01-25"));
        dates.add(LocalDate.parse("2022-01-26"));
        dates.add(LocalDate.parse("2022-01-27"));
        dates.add(LocalDate.parse("2022-01-31"));
        dates.add(LocalDate.parse("2022-02-01"));
        dates.add(LocalDate.parse("2022-02-04"));


        System.out.println(dates.get(dates.size()-1));
        dates.clear();
        System.out.println(dates.size());

        var a=new Jisha_ccpm();
        a.main(args);
        var i=1;
        var b=new ArrayList<>();
        var bf=new int[7];
        System.out.println(i);
        String s=null;
        var e=s;
        var s1=0.1;
        short s2=2;
        var s3=  (s1+s2);
        var d=100*.01;
        var he=0;
        he= (int) (s1*i);
        String n1="jisha";
        String n2="jisha";
        System.out.println(n1==n2);
        System.out.println("//////////////////////////////////");
        int[] reperating={1,2,3,2,2,2};
        int [] nonreaparting=new int[reperating.length];
        int count=0;
        //   System.out.println(reperating);
        for(int ij=0;ij<reperating.length;ij++){
            int jp;
            for( jp=0;jp<ij;jp++)
            {
                if(reperating[jp]==reperating[ij])
                    break;
            }
            if(ij==jp){
                nonreaparting[count]=reperating[ij];
                System.out.println(reperating[ij]+" "+ij+" "+jp);
                count++;}
        }
        System.out.println(".........");
        for(int ah:nonreaparting)
            if(ah!=0)System.out.println(ah);

    }
}