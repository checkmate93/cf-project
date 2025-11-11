package gr.aueb.cf.ch3;

import java.util.Scanner;

public class SumOfEvents {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int inputNum=0;
        int sum =0;
        int i =2;
        int count =0;


        System.out.println("please insert the upper limit");

        inputNum=in.nextInt();

        while (inputNum >= i) {

            sum= sum+ 2;
            i= i +2;

        }

        System.out.println("sum" +sum);
    }
}
