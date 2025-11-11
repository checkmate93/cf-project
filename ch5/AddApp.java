package gr.aueb.cf.ch5;

public class AddApp {
    public static void main(String[] args) {
        int a=10;
        int b = 5;
        int sum =0 ;
        int sub= 0;

        sum=AddApp.add(a,b);
        sub = AddApp.sub(a,b);
        System.out.println(sum);
        System.out.println(sub);
    }

   public static  int add(int a , int b) {

        int result = 0;

        result= a + b;

        return result;
   }
   public static int sub (int a , int b) {
        return a-b;

   }
}
