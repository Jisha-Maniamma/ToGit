package com.Java.Class1.Day30.a2;

import java.time.LocalDate;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/06/10 7:39
 */
public class Holidays {
    private LocalDate date;

    public Holidays(LocalDate date){
        this.date=date;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Holidays){
            Holidays b=(Holidays) obj;
            return (date.equals(b.getDate()));

        }else{
            return false;
        }
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
