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
      Banking account1=new Banking("Jisha","Maniamma",1000);
      double balance=account1.deposit(200);
      assertEquals(1200,balance,0);
    }

    @org.junit.jupiter.api.Test
    void withdraw() {
        Banking account1=new Banking("Jisha","Maniamma",1000);
        double balance=account1.withdraw(200);
        assertEquals(800,balance,0);
    }

    @org.junit.jupiter.api.Test
    void getBalance_after_withdraw() {
        fail("yet to be implimented");
    }
    @org.junit.jupiter.api.Test
    void getBalance_after_dposit() {
        fail("yet to be implimented");
    }

    @org.junit.jupiter.api.Test
    void TestDummy(){
        assertEquals(20,21);
    }
}