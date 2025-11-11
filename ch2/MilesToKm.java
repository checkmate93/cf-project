package gr.aueb.cf.ch2;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        final double KM_PER_MILE = 1.6;
        double inputMile= 0.0;
        double killometers=0.0;
        Scanner in = new Scanner(System.in);

        System.out.println("please insert miles ");
        inputMile=in.nextDouble();
        killometers= inputMile * KM_PER_MILE;

        System.out.println("Miles:" +inputMile + " , km" +killometers);
    }
}
