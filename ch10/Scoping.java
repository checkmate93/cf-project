package gr.aueb.cf.ch10;

public class Scoping {
    public static void main(String[] args) {
        int a=10;
        int b = 20;
        int result= 0;
        result= add(a,b);
        System.out.println(result);


    }

    public static int add (int a, int b){
        return a+b;

    }
}

