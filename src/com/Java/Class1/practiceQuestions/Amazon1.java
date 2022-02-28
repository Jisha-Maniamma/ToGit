package com.Java.Class1.practiceQuestions;

public class Amazon1 {
    public static void main(String[] args) {
        String test="aaabbc";
        String answer1=test1(test);
        System.out.println(answer1);
        System.out.println(test2("a1b4a7f1"));
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
