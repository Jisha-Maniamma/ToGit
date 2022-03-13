package com.Java.Class1.Day49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class arrayRepeating1 {
    public static void main(String[] args) {
        int[] input={2,3,52,62,88,45,26,66,62,66,65,60,61,55,55,55,13};
        List<Integer> output=new ArrayList<>();
        for(int i=0;i<input.length;i++){
            output.add(input[i]%10);
            if(input[i]/10!=0)output.add(input[i]/10);
        }
        System.out.println(output);
        System.out.println("...........................................");

        findMaxRepeatingString(output);
        System.out.println("...........................................");
        System.out.println("...........................................");

String text="LeetCode is one of the most well-known online judge platforms that you can use to practice your programming skills by solving coding questions. It has over 1,100 different problems, support for over 18 programming languages, and languages an languages languages languages active community that is always there to help you with the solutions you come up with.";
        text=text.replaceAll("[-,.]","");
        List<String> inputText= Arrays.asList(text.split(" "));
        findMaxRepeatingString1(inputText);
       // findMaxRepeatingString1((Arrays.asList(new String[]{"java", "apple", "car", "car", "java", "java"})));
        System.out.println("...........................................");

        //////////////////////
//        for(int i=0;i<output.size();i++){
//            output.set(i,(output.size()+(output.get(i)% output.size())));
//
//        }
        int max=output.get(0);
        int num=0;
        int result=0, count=0,maxcount=0;
        for(int i=0;i< output.size();i++){
            count=1;
            for(int j = i+1; j < output.size(); j++){
                if(output.get(i).equals(output.get(j))){
                    count++;
                }
            }
//            if(output.get(i)>max){
//                max=output.get(i);
//                result=max;
//            }
            if(count > maxcount){
                maxcount = count;
                num = output.get(i);
            }

        }
        System.out.println(num);

    }

    private static void findMaxRepeatingString(List<Integer> output) {
        int max=0;
        int count=0;
        int result=0;
        for(int i=0;i<output.size();i++){
            count=0;
            for(int j=0;j<output.size();j++){
                if(output.get(i)==output.get(j)){
                    count=count+1;
                }
            }
            if(count>max){
                max=count;
                result=output.get(i);
            }

        }
        System.out.println("...."+result+" "+max);
        //8-9 cook
        //

    }
    private static void findMaxRepeatingString1(List<String> strings){
      int count=0;int max=0;
      String maxrepating="";
      int loction=0;

      for(int i=0;i< strings.size();i++){
          count=0;
          for(int j=0;j< strings.size();j++){

              if(strings.get(i).equals(strings.get(j))){
                  count++;
              }
          }


          if(count>max){
              max=count;
              maxrepating=strings.get(i);
          }
      }
        System.out.println(maxrepating);
    }
}
