package gr.aueb.cf.ch5;

public class SwapApp {
    public static void main(String[] args) {
        int a= 10;
        int sum;
        int b= 4;
         swap(a,b);
        System.out.println(a +"" +b);

    }

    public static void swap (int a , int b) {
        int tmp = a;
        a= b;
        b= tmp;


    }
}
