package com.LickingHeights;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int month, day, year;

        System.out.println("What is the month you were born?");
        month = keyboard.nextInt();
        System.out.println("What day of the month were you born?");
        day = keyboard.nextInt();
        System.out.println("What year were you born?");
        year = keyboard.nextInt();
        System.out.println(monthoftheyear(month));

    }


    public static int monthoftheyear(int month) {
        if (month == 1) {
            System.out.println("January which is the first month of the year");
        }
        if (month == 2) {
            System.out.println("February which is the second month of they year");
        }
        if (month == 3) {
            System.out.println("March which is the third month of the year");
        } {

        }

    }
}


