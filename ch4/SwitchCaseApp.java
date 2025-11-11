package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice ;

        do {
            System.out.println("epelekse ena apo ta parakatw");
            System.out.println("1.game");
            System.out.println("2.game");
            System.out.println("3.game");

            choice=scanner.nextInt();
            if (choice <1 || choice >4 ) {
                System.out.println( "choice must been between 1 and 4");
                System.out.println("try again");
                continue;
            }

           // if (choice == 1) {


//            System.out.println("one player game  starting ");
//            } else if (choice == 2) {
//                System.out.println("player 2 starter");
//            }
//            else if(choice == 3) {
//                System.out.println("player 3starter");
//            } else {     System.out.println("quiting,,,,,");
//            }

                switch (choice) {

                    case 1:
                        System.out.println("one player starter");
                        break;
                    case 2:
                        System.out.println("2nd");
                        break;
                    case 3:
                        System.out.println("3nd");
                        break;
                    case 4:
                        System.out.println("quiting");
                    default:
                        System.out.println("Erorr");
                        break;
                }



        } while ( choice !=4) ;
    }
}
