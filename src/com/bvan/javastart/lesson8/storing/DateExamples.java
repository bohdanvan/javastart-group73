package com.bvan.javastart.lesson8.storing;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/**
 * @author bvanchuhov
 */
public class DateExamples { // Java 8 (2013)

    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);

        LocalTime lt = LocalTime.now();
        System.out.println(lt);

        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);

        // ---------

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowYearAgo = now.minusYears(1);
        DayOfWeek dayOfWeekYearAgo = nowYearAgo.getDayOfWeek();
        System.out.println(dayOfWeekYearAgo.name());

        // ---------

        LocalDate elvisBirthDate = LocalDate.of(1935, 1, 8);
        System.out.println(elvisBirthDate.getDayOfWeek());
        System.out.println(elvisBirthDate.isLeapYear());

        // -------

        LocalDate christBirthDate = LocalDate.of(0, 1, 7);
        System.out.println(christBirthDate.getDayOfWeek());
    }
}
