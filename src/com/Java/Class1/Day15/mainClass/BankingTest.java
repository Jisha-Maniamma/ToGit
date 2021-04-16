package com.Java.Class1.Day15.mainClass;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/04/16 11:10
 */
class BankingTest {

    @org.junit.jupiter.api.Test
    void deposit() {
      Banking account1=new Banking("Jisha","Maniamm",1000);
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        fail("yet to be implimented");
    }

    @org.junit.jupiter.api.Test
    void getBalance() {
        fail("yet to be implimented");
    }
    @org.junit.jupiter.api.Test
    void TestDummy(){
        assertEquals(20,21);
    }
}