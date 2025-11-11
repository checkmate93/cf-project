package gr.aueb.cf.ch9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class FileInOutApp {
    public static void main(String[] args) {

        File infd = new File("C:\\Users\\vagge\\Desktop\\NeaEfarmogh\\7file.txt");
        File outfd = new File("C:\\Users\\vagge\\Desktop\\NeaEfarmogh\\7fileout.txt");
        String line;
        String[]  tokens;

        try (Scanner in = new Scanner(infd);
             PrintStream ps = new PrintStream(outfd , StandardCharsets.UTF_8)) {
            while (in.hasNextLine()) {
                line =in.nextLine();
                tokens=line.split("\\s+");

                for ( String token : tokens){
                    System.out.println(token.trim()+" ");
                    ps.printf("%s ",token);
                    ps.flush();
                }
                System.out.println();
                ps.println();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
