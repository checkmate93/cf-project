package gr.aueb.cf.ch7;

public class StrSplit {
    public static void main(String[] args) {
        String s1 = "Athes uni   of econ";

        String [] tokens = s1.split("\\s+");

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
