package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EuroUsdConverter {
    public static void main(String[] args) {
        int euro = 0;
        int totalUsaCents= 0 ;
        int usdDollars= 0 ;
         int usaCents = 0;
         final  double  ISOTIMIA  = 99 ;
         Scanner in = new Scanner(System.in);

        System.out.println("dwse eurw :");
        euro = in.nextInt();
        totalUsaCents= (int)(euro * ISOTIMIA) ;
        usdDollars =totalUsaCents / 100 ;
        usaCents = totalUsaCents % 100 ;
        System.out.printf("%d  \u20AC 1euros = %d dollars and %cents" , euro , usdDollars , usaCents);

         // utf-8 euro sign


    }
}
