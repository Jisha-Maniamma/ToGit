package com.Java.Class1.Day18;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/05/18 8:20
 */
public class LinkedLList {
    public static void main(String[] args) {
        // List<String> names=new ArrayList<>();
        LinkedList<String> ll
                = new LinkedList<String>();

        ll.add("iisha9");
        ll.add("jisha2");
        ll.add("kisha3");
        ll.add("isha4");
        ll.add("jisha5");
        ll.add("misha6");
        ll.add("jisha7");
        ll.add("jisha8");

        ListIterator<String> iterator=ll.listIterator();
        int i=-1;
        while(iterator.hasNext()){

            System.out.println(iterator.next());

        }
        System.out.println("..............");
        ll.remove(1);
        System.out.println("...................");
        ListIterator<String> iterator1=ll.listIterator();
        while(iterator1.hasNext()){

            System.out.println(iterator1.next());

        }

        List<String> slist = Arrays.asList("Tanu", "Kamal", "Suman", "Lucky", "Bunty", "Amit");
        List<String> sortedList = slist.stream().sorted().collect(Collectors.toList());
        sortedList.forEach(System.out::println);

        System.out.println("*********************************************************");

        AddNewName(ll,"lishaaaaa");
        iterator1=ll.listIterator();
        while(iterator1.hasNext()){

            System.out.println(iterator1.next());

        }
        System.out.println("*********************************************************");
        LinkedList<String> ll2
                = new LinkedList<String>();
        AddNewName(ll2,"Ram");
        AddNewName(ll2,"Adidev");
        AddNewName(ll2,"Sita");
        AddNewName(ll2,"Govind");
        AddNewName(ll2,"Sushruta");

        iterator1=ll2.listIterator();
        while(iterator1.hasNext()){

            System.out.println(iterator1.next());

        }
        System.out.println("............................................");
        Double d=12.23224;
        System.out.println(d);
        System.out.println(Math.round(d*100d)/100d);
        System.out.println(d);
    }

    public static boolean AddNewName(List<String> a,String name){
        ListIterator<String> iterator=a.listIterator();
        while(iterator.hasNext()){
            int compare=iterator.next().compareTo(name);

            if (compare>0){
                iterator.previous();
                iterator.add(name);
                return true;
            }


        }
        iterator.add(name);
        return  false;
    }
}
