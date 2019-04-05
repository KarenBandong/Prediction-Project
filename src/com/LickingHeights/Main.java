package com.LickingHeights;

import java.sql.SQLOutput;
import java.time.Year;
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
            dayoftheweek(day, month, year);

    }
    }
      public static String daysofmonth(int month){
        String monthString="";
        switch (month){
            case 1: monthString= "THERE ARE 31 DAYS IN JANUARY";
                break;
            case 2: monthString= "THERE ARE EITHER 28 OR 29 DAYS IN FEBRUARY";
                break;
            case 3: monthString= "THERE ARE 31 DAYS IN MARCH";
                break;
            case 4: monthString= "THERE ARE 30 DAYS IN APRIL";
                break;
            case 5: monthString= "THERE ARE 31 DAYS IN MAY";
                break;
            case 6: monthString= "THERE ARE 30 DAYS IN JUNE";
                break;
            case 7: monthString= "THERE ARE 31 DAYS IN JULY";
                break;
            case 8: monthString= "THERE ARE 30 DAYS IN AUGUST";
                break;
            case 9: monthString= "THERE ARE 31 DAYS IN SEPTEMBER";
                break;
            case 10: monthString= "THERE ARE 30 DAYS IN OCTOBER";
                break;
            case 11: monthString= "THERE ARE 31 DAYS IN NOVEMBER";
                break;
            case 12: monthString= "THERE ARE 30 DAYS IN DECEMBER";
                break;
        }
        System.out.println(monthString);
        return (monthString);
      }
      public static String dayoftheweek(int day, int month, int year){
        String daysString="";
        int dayoftheweek;
       int modYear= year%100;
        int zeroYear= year/100;
          dayoftheweek = day + 13*(month+1)/5 + modYear + modYear/4 + zeroYear/4 + 5*zeroYear;
          dayoftheweek= dayoftheweek%7;

        switch (dayoftheweek){

            case 0: daysString="SATURDAY";
            break;
            case 1: daysString="SUNDAY";
            break;
            case 2: daysString="MONDAY";
                break;
            case 3: daysString="TUESDAY";
                break;
            case 4: daysString="WEDNESDAY";
                break;
            case 5: daysString="THURSDAY";
                break;
            case 6: daysString="FRIDAY";
                break;
        }
          System.out.println(daysString);

        return (daysString);

      }
      public static String
}


