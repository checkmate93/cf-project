package gr.aueb.cf.ch2;

import java.util.Locale;
import java.util.Scanner;

public class DateTimeToSecondsConverter {
    public static void main(String[] args) {
        final int SECOND_PER_DAY = 3600 * 60 ;
        final int SECOND_PER_HOUR = 3600;
        final int SECOND_PER_MINUTE = 60;

        Scanner in = new Scanner(System.in);
        int inputDays;
        int inputHours;
        int inputMinutes;
        int inputSeconds;
        int totalSeconds = 0;

        System.out.println("dwse meres wres lepta seconds");
           inputDays= in.nextInt();
           inputHours= in.nextInt();
           inputMinutes= in.nextInt();
           inputSeconds = in.nextInt();


           totalSeconds= inputDays*SECOND_PER_DAY +inputHours*SECOND_PER_HOUR;

        System.out.printf( Locale.US,"TOTAL SECONDS %,d" , totalSeconds);



    }
}
