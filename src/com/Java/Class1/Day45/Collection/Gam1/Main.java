package com.Java.Class1.Day45.Collection.Gam1;

import java.time.LocalDate;
import java.util.*;

public class Main {
    public static HashMap<Integer,Location> locations=new HashMap<>();

    public static void main(String[] args) {
        locations.put(0,new Location(0,"at home"));
        locations.put(1,new Location(1,"at shop"));
        locations.put(2,new Location(2,"at school"));
        locations.put(3,new Location(3,"at job"));
        locations.get(1).SetExists("E",2);

        System.out.println(locations.get(1).getExixts());

        List<Integer> a=new ArrayList<>();
        a.add(1);
        a.add(100);
        a.add(45);
        int[] ad={1,20,54,45};
        System.out.println(Collections.max(a));
        System.out.println(ad);
        System.out.println(Arrays.toString(ad));
//        System.out.println(Collections.max(ad));

        System.out.println("=========================");

      HashMap<String,String> vocabulary=new HashMap<>();
        HashMap<String,Integer> voca=new HashMap<>();
      vocabulary.put("North","N");
        vocabulary.put("South","S");
        vocabulary.put("West","W");
        vocabulary.put("East","E");

        voca.put("North",0);
        voca.put("South",0);
        voca.put("West",0);
        voca.put("East",0);
       String s="How about North goin to the North but North South East East";
       String[] aaa=s.split(" ");

       for(String dir:aaa){
         //  int count=0;
        if(voca.containsKey(dir))
            voca.replace(dir,voca.get(dir)+1);
    }

        System.out.println(voca);
        List<LocalDate> holidaysForProject=new ArrayList<>();
        holidaysForProject.add(LocalDate.of(2022,03,04));


        String ss="Sed ut perspiciatis unde omnis c iste natus error sit voluptatem accusantium doloremque laudantium, c totam rem aperiam, eaque ipsa c quae ab illoc c c c c c c c c c c c c c c c c c jlkjdlkbjldkbjldkb c lkjlvkjsdlvk c kjlksldf  inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur?";
        String [] arr=ss.split(" ");
        for(String b:arr){
            if(b.equals("c"))
                voca.put(b,voca.get(b)==null?1:voca.get(b)+1);
        }
        System.out.println(voca);
    }


}
