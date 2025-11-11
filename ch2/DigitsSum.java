package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DigitsSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int leftDigit= 0;
        int rightDigit= 0;
        int inputNum;
        int sum = 0;

        System.out.println(" please insert a two digit number:");
        inputNum = in.nextInt();

        leftDigit = inputNum /10 ;
        rightDigit = inputNum % 10 ;

        System.out.printf(" the number is  %d + %d  = %d" , leftDigit , rightDigit , inputNum);

    }
}
