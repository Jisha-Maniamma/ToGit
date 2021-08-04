package com.Java.Class1.Day41;


import java.util.ArrayList;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/08/03 8:12
 */
public class main {
    public static void main(String[] args) {
        String a="/*faf*/hllo/*faf*/das/*klnvlkdv"+
              " */ bcbvcbv";


        ArrayList<StringBuilder> myrraylist=new ArrayList<StringBuilder>();
        StringBuilder sb1=new StringBuilder("jan");
        StringBuilder sb2=new StringBuilder("feb");
        myrraylist.add(sb1);
        myrraylist.add(sb2);
        ArrayList<StringBuilder> assignedArrList=myrraylist;
        ArrayList<StringBuilder> clonedArList=( ArrayList<StringBuilder>)myrraylist.clone();


        System.out.println(myrraylist==assignedArrList);
        System.out.println(myrraylist==clonedArList);


        StringBuilder myArrVVal=myrraylist.get(0);
        StringBuilder assignedArrVal=assignedArrList.get(0);
        StringBuilder clonedArrVal=clonedArList.get(0);

        System.out.println(myArrVVal==assignedArrVal);
        System.out.println(myArrVVal==clonedArrVal);


//        System.out.println(myrraylist.toString().contains("jan"));



    }

//    @Override
//    public boolean equals(Object obj) {
//        if(obj instanceof StringBuilder){
//            StringBuilder sb=(StringBuilder) obj;
//            return sb.equals(this);
//        }
//        return false;
//    }
}
