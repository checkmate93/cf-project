package gr.aueb.cf.ch9;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;

public class BufferReaderApp {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader bf = new BufferedReader(new FileReader("C:\\Users\\vagge\\Desktop\\NeaEfarmogh\\7file.txt"))) {

            String line=  "";
            while ((line = bf.readLine()) != null); {
                sb.append(line).append("\n");
            }
            
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
