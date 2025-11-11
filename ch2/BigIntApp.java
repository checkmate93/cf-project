package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 * BigInteger class name
 */

public class BigIntApp {
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111111112345678643211122");
        BigInteger bigNum2 = new BigInteger("11111111111111111111111111111111111111111111111111111111111111111112345678643211122");
        BigInteger result;

        result= bigNum1.add(bigNum2);

        System.out.printf( "%,d" ,result);
    }
}
