package com.Java.Class1.A00;

import java.util.*;

public class man {
    public static void main(String[] args) {
        String s="American Google LLC is an American multinational technology American company that focuses on artificial intelligence, search engine, online advertising, cloud computing, computer software, quantum computing, e-commerce, and consumer electronics.";
        s=s.replaceAll(",","");
        List<String> ss=new ArrayList<>(Arrays.asList(s.split("[' ' ,.]")));
        System.out.println(ss);
        Map<String,Integer> myHashmap=new HashMap<>();
        for(String a:ss){
            System.out.println(a);
        }
        System.out.println(ss.size());
        int count=0;
        String[] myArray = new String[ss.size()];
        System.out.println(ss.toArray(myArray));
//        Arrays.asList name.toArray(ara)
        for(int i=0;i<ss.size();i++){
count=1;
            for(int j=i+1;j<ss.size();j++){
                if(ss.get(i).equals(ss.get(j))){
                    System.out.println(ss.get(i));
                  count=count+1;
                //    System.out.println(ss.get(i)+" "+ss.get(j)+" "+count);
                }


            }
            if(count>0){

               if(myHashmap.get(i)!=null)
                    System.out.println(myHashmap.get(ss.get(i)));
                myHashmap.put(ss.get(i),myHashmap.get((ss.get(i)))==null?1:myHashmap.get(ss.get(i))+1);

            }
        }
        System.out.println(myHashmap);


        System.out.println("///////////////////////////////////////");
        String myWord="Juntos";
        myWord=myWord.toLowerCase();
        String strng=" sotnju American Google LLC is an American multinational technology American company that focuses on artificial intelligence, search engine, online advertising, cloud computing, computer software, quantum computing, e-commerce, and consumer electronics.";

    }

}
