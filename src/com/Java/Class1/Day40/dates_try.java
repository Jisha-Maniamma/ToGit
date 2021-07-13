package com.Java.Class1.Day40;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.JapaneseChronology;
import java.time.chrono.JapaneseDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * @author Jisha Maniamma
 * @version 1.0
 * @date 2021/07/13 11:40
 */
public class dates_try {
    static DateTimeFormatter dformatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.JAPAN).withChronology(JapaneseChronology.INSTANCE);
    public static void main(String[] args) {
        System.out.println(LocalDate.now(ZoneId.systemDefault()));
        System.out.println( JapaneseDate.from(LocalDate.now()));
        System.out.println(dformatter.format(JapaneseDate.from(LocalDate.now())));
    }
}
