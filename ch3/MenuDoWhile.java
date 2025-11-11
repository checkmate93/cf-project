package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuDoWhile {
    public static void main(String[] args) {
        int i = 1;
        Scanner in = new Scanner(System.in);
        int choice =03;

        do {
            System.out.println("please selecet one ");
            System.out.println("1.Menu ");
            System.out.println("2.Settings");
            System.out.println("3 Exit");
            choice = in.nextInt();

        } while (choice!=3);




    }
}
