package gr.aueb.cf.ch7;

public class SubString {
    public static void main(String[] args) {

        String cf="Coding Factory";
        int positionOf= cf.indexOf("o");
        int positionOfSec= cf.indexOf("o",2);
        int positionLast= cf.lastIndexOf("o");

        String cf2= cf.substring(0);
    }
}
