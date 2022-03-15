package com.Java.Class1.A0;

import org.jetbrains.annotations.NotNull;

public class InsertionSort {
    public static void main(String[] args) {
        int[] myArray={1,5,9,10,22,2,20,56,99,23,10,1};
        insertionSort(myArray);
    }
    public static void insertionSort(@NotNull int myArray[]) {

        for(int i=1;i<myArray.length;i++){
            int j=i-1;
            int element=myArray[i];
            while(j>=0 && myArray[j]>element){
                myArray[j+1]=myArray[j];
                j--;
            }
            myArray[j+1]=element;
        }

        for(int a:myArray){
            System.out.print(a+" ");
        }
    }
}
