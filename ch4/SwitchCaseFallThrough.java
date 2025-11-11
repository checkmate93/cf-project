package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchCaseFallThrough {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade ;

        System.out.println("give a grade");
        grade=scanner.nextInt();

        switch (grade) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("failed");
                break;
            case 5:
            case 6:
                System.out.println("Good");
            case 7:
            case 8:
                System.out.println("Very Good");
                break;
            case 9 :
            case 10:
                System.out.println("exellent");
                break;
            default:
                System.out.println("error in break");
                break;



        }

    }
}
