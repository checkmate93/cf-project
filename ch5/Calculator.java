package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * calculator
 * prosthesh
 * afairesh
 * ektupwnetai to apotelesma
 *
 */
public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int result = 0;
        int choice;

        while (true) {
            MenuApp.printMenu();

            choice = Calculator.getOneInt();

            if (!isChoiceValid(choice)) {
                continue;
            }

            if (choice == 6) {
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("result" + result);

        }


    }


    public static void printMenu() {
        System.out.println("Epilekste ena apo ta parakatw");
        System.out.println("1. EISAGWGH");
        System.out.println("2. ANAZHTHSH");
        System.out.println("3.Enhmerwsh");
        System.out.println("4 . eksodos");
    }

    public static int getOneInt() {


        return scanner.nextInt();
    }

    public static boolean isChoiceValid(int choice) {
        return choice >= 1 && choice <= 6;
    }

    public static int getResultOnChoice(int choice) {
        int num1 = 0;
        int num2 = 0;
        int result = 0;

        num1 = getOneInt();
        num2 = getOneInt();


        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
        }
        return result;
    }




    public static int add(int a , int b) {
        return a+b;
    }

    public static int sub(int a , int b) {
        return a-b;
    }

    public static int mul(int a , int b) {
        return a*b;
    }





}
