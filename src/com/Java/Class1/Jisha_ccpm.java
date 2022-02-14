package com.Java.Class1;

import java.util.ArrayList;
import java.util.List;


public class Jisha_ccpm {
    static List<String> arr=new ArrayList<>();

    public static void main(String[] args) {
        arr.add("1a");
        arr.add("1a");
        arr.add("1a");
        arr.add("1a");



        for(int i=0;i<arr.size();i++){
            int j;
            for(j=0;j<i;j++){
                if(arr.get(i).equals( arr.get(j)))
                    break;

            }
            if(i==j)
            System.out.println(arr.get(i));
        }
       List<String> projectToChange=arr;

        for(int i=0;i<projectToChange.size();i++){
            int j;
            for (j=0;j<i;j++) {
                if (projectToChange.get(j).equals( projectToChange.get(i)))
                    break;
            }
          //  if(i==j)
              // projects.add(projectToChange.get(i).getPname());

        }

    }
}
