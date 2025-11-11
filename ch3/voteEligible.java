package gr.aueb.cf.ch3;

import java.util.Scanner;

public class voteEligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isEligibe =false ;
        int num= 0 ;

        System.out.println("dwse enan arithmo");
        num= in.nextInt();

        isEligibe= num >= 18 ;

        System.out.printf("the person is eligible : %b" ,isEligibe);


    }


}
