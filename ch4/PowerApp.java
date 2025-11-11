package gr.aueb.cf.ch4;

import java.math.BigInteger;

public class PowerApp {
    public static void main(String[] args) {
        BigInteger bigResult = new BigInteger("1");
        int base= 2;
        int power = 1000 ;
       // int result=1;

        for (int i =1 ;  i <= power; i++) {

           // result= result * base;
            bigResult=bigResult.multiply(BigInteger.valueOf(base));

        }
        System.out.println(bigResult);
    }
}
