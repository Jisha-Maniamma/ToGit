package com.Java.Class1.Day49;

public class Arrayreepeating {
    public static void main(String[] args) {
        int arr[] = {2, 3, 3, 5, 3, 4, 1, 7,7,7};
        for (int i = 0; i< arr.length; i++) {
            System.out.println("i ="+i+", "+arr[i] +" % "+arr.length+"="+(arr[i] % arr.length));
            System.out.println( arr[(arr[i] % arr.length)]+"+ "+arr.length+" = "+(arr[(arr[i] % arr.length)] + arr.length));

            arr[(arr[i] % arr.length)] += arr.length;

        }

        int max = arr[0], result = 0;
        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
                result = i;
            }
        }

        System.out.println("...............");
        for(int aa:arr){
            System.out.println(aa);
        }

        System.out.println("----"+result);

    }

}
