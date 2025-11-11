package gr.aueb.cf.ch3;

import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int base=0;
        int power =0;
         int total=1;
        System.out.println("dwse to power");
        power=in.nextInt();

        System.out.println("dwse to base");
        base=in.nextInt();

        int i =1;
        while (i <= power)  {
            total = total* base ;
            i++;


        }
        System.out.println(""+total);


    }
}
