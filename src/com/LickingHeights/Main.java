package com.LickingHeights;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int month, year, day;
        boolean running = true;
        while (running = true) {


        System.out.println("Monday's child is fair of face,\n" +
                "Tuesday's child is full of grace,\n" +
                "Wednesday's child is full of woe,\n" +
                "Thursday's child has far to go.\n" +
                "Friday's child is loving and giving,\n" +
                "Saturday's child works hard for a living,\n" +
                "But the child born on the Sabbath Day,\n" +
                "Is fair and wise and good in every way.\n");
            System.out.println("What month were you born?");
            month= keyboard.nextInt();
            System.out.println("What day were you born?");
            day=  keyboard.nextInt();
            System.out.println("What year were you born?");
            year=  keyboard.nextInt();

            daysofmonth(month);
    }
    }
      public static int daysofmonth(int month){
        String monthString;
        switch (month){
            case 1: monthString= "There are 31 days in January";
            case 2: monthString= "There are either 28 days or 29 days in February";
            case 3: monthString= "There are 31 days in March";
            case 4: monthString= "There are 30 days in April";
            case 5: monthString= "There are 31 days in May";
            case 6: monthString= "There are 30 days in June";
            case 7: monthString= "There are 31 days in July";
            case 8: monthString= "There are 30 days in August";
            case 9: monthString= "There are 31 days in September";
            case 10: monthString= "There are 30 days in October";
            case 11: monthString= "There are 31 days in November";
            case 12: monthString= "There are 30 days in December";

        }
      }
}


