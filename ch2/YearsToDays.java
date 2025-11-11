package gr.aueb.cf.ch2;

import java.util.Scanner;

public class YearsToDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int DAYS_PER_YEAR = 365;
        int age= 0;
        int days = 0;
        int hours = 0;

        System.out.println("please insert your age");
        age=scanner.nextInt();

        days = age * DAYS_PER_YEAR;
        hours = days * 24 ;

        System.out.println("AGE IN YEARS " +age + "age in days: " +days);
        System.out.println("days in hours: " +hours);

    }
}
