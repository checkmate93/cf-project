package gr.aueb.cf.ch9;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class PrintStreamWithMethod {
    public static void main(String[] args) {

        try (PrintStream ps =new PrintStream("C:\\Users\\vagge\\Desktop\\NeaEfarmogh\\7file.txt" ,StandardCharsets.UTF_8)){
            printMessage(ps , "Hello coding factory!!" );
            printMessage(System.out , "hello ");;

        } catch (IOException e ) {
            e.printStackTrace();
        }


    }

    public static void printMessage (PrintStream ps , String message) {
        ps.print(message);
    }
}
