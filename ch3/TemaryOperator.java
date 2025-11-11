package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Demo of temary operator
 */
public class TemaryOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        int abs;

        System.out.println("please enter num");
        num=scanner.nextInt();

//        if(num >= 0) {
//            abs = num;
//        }
//        else
//
//            {
//                abs=-num;
//            }
//        }

        abs = (num >= 0) ? num: -num;






    }

}


