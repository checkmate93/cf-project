package gr.aueb.cf.ch3;

import java.util.Scanner;

public class IsEven {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num ;
        boolean isEven;

        System.out.println("dwse enan arithmo");
        num=in.nextInt();

        isEven= num % 2 ==0;

        System.out.printf("%b is even ", isEven);


    }
}
