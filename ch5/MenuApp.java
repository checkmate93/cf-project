package gr.aueb.cf.ch5;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        do {


            printMenu();
            choice=in.nextInt();
            if (!isChoiceValid(choice)){
                System.out.println("choice not valid ");
                continue;
            }

            doOnChoice(choice);

        } while (choice != 4);
    }
    public static void printMenu() {
        System.out.println("Epilekste ena apo ta parakatw");
        System.out.println("1. EISAGWGH");
        System.out.println("2. ANAZHTHSH");
        System.out.println("3.Enhmerwsh");
        System.out.println("4 . eksodos");
    }
    public static boolean isChoiceValid (int choice ) {
        return choice >=1 && choice <=5;
    }

    public static void doOnChoice( int choice) {
        switch (choice ) {
            case 1:
                System.out.println("eisagwgh");
                break;
            case 2:
                System.out.println("eisagwgh");
                break;
            case 3:
                System.out.println("eisagwgh");
                break;
            case 4:
                System.out.println("eksodos");
                break;
            default:
                System.out.println("lathos epilogh");
                break;

        }
    }


}
