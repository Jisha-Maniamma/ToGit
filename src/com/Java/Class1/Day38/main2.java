package com.Java.Class1.Day38;

import java.time.LocalTime;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/07/07 7:55
 */
public class main2 {
    public static void main(String[] args) {
main2 m=new main2();
m.goTreaking();
    }

    private void goTreaking() {

        LocalTime hrs= LocalTime.now();
        if(hrs==LocalTime.now())throw new fellHunrgyException();
    }


}
//if this extends only exception then throws chahiyae
class fellHunrgyException extends RuntimeException{

}