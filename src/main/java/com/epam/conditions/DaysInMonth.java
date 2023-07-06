package com.epam.conditions;

import java.time.Year;
import java.time.YearMonth;

public class DaysInMonth {

    public void printDays(int year, int month) {

        if (year > 0 && month > 0 && month < 13) {
            System.out.println(YearMonth.of(year, month).getMonth().length(Year.isLeap(year)));
        }
        else{
            System.out.println("invalid date");
        }
    }

}
