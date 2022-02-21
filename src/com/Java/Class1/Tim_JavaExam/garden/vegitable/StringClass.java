package com.Java.Class1.Tim_JavaExam.garden.vegitable;

import java.util.ArrayList;
import java.util.List;

public class StringClass {
    public static void main(String[] args) {
        String s=String.join("","Jisha"," Maniamma");
        System.out.println(s.toString());
        System.out.println(s.equals("jisha"));
        System.out.println(s.repeat(2));

        int[] testArray=new int[]{1,2,3,4,5};
        List<Integer> test=new ArrayList<>();
        test.add(1);test.add(2);test.add(3);

        getYourValue(test);
    }

    private static void getYourValue(List<Integer> test) {
        int total=0;
//        for(Integer number:test){
//            System.out.println(number);
//        }

        for(int i=0;i<test.size();i++){
            List<Integer> array=new ArrayList<>();
            for(int j=i;j< test.size();j++){
                array.add(test.get(j));
                System.out.println("................................................ "+i+" "+j);
                //+" for "+i+" "+j

               if(i==j){
                   System.out.println("sum is "+ test.get(j));
                   total += test.get(j) * getMinimum(array);

                   System.out.println("min is " + getMinimum(array));
                   System.out.println("total is " + test.get(j) * getMinimum(array));
               }
                else {
                    System.out.println("sum is "+ getSum(array));
                    System.out.println("min is " + getMinimum(array));
                    total += (getSum(array) * getMinimum(array));
                    System.out.println("total is " + getSum(array) * getMinimum(array));
                }
            }

        }
        System.out.println(total);

    }

    private static int getMinimum(List<Integer> array) {
        int min=array.get(0);
        for(int a:array){

            min=min<a?min:a;
        }
        for(int a:array){
            System.out.print(a+" ; ");
        }

        return min;
    }

    private static int getSum(List<Integer> array) {
        int sum=0;
        for(Integer a:array){
            sum+=a;
        }
        return sum;
    }
}
