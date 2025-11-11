package gr.aueb.cf.ch5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TriangleUp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a ;
        double b;
        double c;
        final double EPSILON =0.005;

        System.out.println("please enter a b c ");
        b=scanner.nextDouble();
        a=scanner.nextDouble();
        c=scanner.nextDouble();

        if (Math.abs(a*a-b*b -c*c) <= EPSILON) {
            System.out.println("triangle is right");
        }
        else {
            System.out.println("triangle is not right");
        }
    }
}
