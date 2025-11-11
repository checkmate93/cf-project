package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Sentinel {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int possitiveCount= 0;
        int inputNum = 0;
        System.out.println("please insert a num");
        inputNum=in.nextInt();

        while (inputNum >= 0) {
            possitiveCount++;
            System.out.println("please insert a num");
            inputNum=in.nextInt();
        }
        System.out.println("the possitive count is " +possitiveCount);




    }
}
