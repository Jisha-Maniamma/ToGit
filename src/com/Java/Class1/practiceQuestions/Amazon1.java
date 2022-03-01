package com.Java.Class1.practiceQuestions;

import java.util.Arrays;
import java.util.TreeSet;

public class Amazon1 {
    public static void main(String[] args) {
//        String test="aaabbc";
//        String answer1=test1(test);
//        System.out.println(answer1);
//        System.out.println(test2("a1b4a7f1"));
        test3("addbca");
      //  test4("abccaba");

    }
    private static void test4(String test){
        StringBuilder sb=new StringBuilder();
        TreeSet<String> subStr=new TreeSet<>();
        char[] nonRepeating=new char[test.length()];
        char[] charactors=test.toCharArray();
        int count=0;
        char previousChar=0;
        String s=null;
        for(int i=0;i<charactors.length;i++){
            count=0;
            System.out.println("ppp "+charactors[i]);
            for (int j=i+1;j<charactors.length;j++) {
                System.out.println(charactors[i]);
                if (charactors[j]==charactors[i]){
                    count++;
                }

                if(count>0){
                    System.out.println("zz "+charactors[j]+" "+count+" "+i);
                    //System.out.println(test.substring(1));
                    s=test.substring(i+1);
                    System.out.println(s);

                }

            }
            if(count==0){
                System.out.println("................"+s+" "+charactors[i]);
                break;
            }
        }
        System.out.println(s);

    }

//    private static void test3(String test){
//
//        char[] ch=test.toCharArray();
//        char[] nonRepeating=new char[test.length()];
//        nonRepeating[0]=ch[0];
//        int count=0;
//        char cTest=0;
//        for(int i=0;i<ch.length;i++){
//            int j;
//            for ( j=0;j<i;j++){
//                if(ch[i]==nonRepeating[j]){  System.out.println(nonRepeating[j]+" "+j+" "+count);break;}
//            else{
//                    System.out.println(j);
//                    nonRepeating[count] = ch[i];
//                    System.out.println(Arrays.toString(nonRepeating));
//                    count++;
//                }
//
//            }
//           System.out.println("...");
//        }
//        System.out.println(Arrays.toString(nonRepeating));
//    }
//

    ////////////////non repeating characters//////////////////
    private static void test3(String test){

        char[] ch=test.toCharArray();
        char[] nonRepeating=new char[test.length()];
        nonRepeating[0]=ch[0];
        int count=0;
        char cTest=0;
        for(int i=0;i<ch.length;i++){
            int j;
            for ( j=0;j<i;j++)
                if(ch[i]==nonRepeating[j]){  System.out.println(nonRepeating[j]+" "+j);break;}
            System.out.println("->");
            if(i==j) {
                System.out.println(j);
                nonRepeating[count] = ch[i];
                count++;
            }

            System.out.println("...");
        }
        System.out.println(Arrays.toString(nonRepeating));
    }
    //////////////////////////////////
    private static String test2(String test){
        int count=0;
        if(test.length()==0){
            return null;
        }
        char[] ch=test.toCharArray();
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<(ch.length/2);i++){
            count=Character.getNumericValue(ch[(i*2)+1]);
            //sb.append(ch[(i*2)]);
            System.out.println(count);
            while(count>0){
                count--;
                sb.append(ch[(i*2)]);
            }
        }
        return sb.toString();
    }
    ////////////////////////////////////////
    private static String test1(String test ){
        char[] char1=test.toCharArray();
        int count=0;
        char previous=0;
        StringBuilder sb=new StringBuilder();
        for(char c:char1){
            if(c==previous){
                count++;
            }
            else{
                if(previous!=0)
                    sb.append(previous).append(count);
                count=1;
                previous=c;
            }
        }
        sb.append(previous).append(count);
        return sb.toString();
    }
}
