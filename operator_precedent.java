import java.util.Scanner;

public class operator_precedent {
    public static void main(String[] args) {
        int a = 6 * 5 - 34 / 2;
        /*
         * 30-17
         * =13
         */
        int b = 5 / 60 - 35 * 2;
        /*
         * 12-70
         * =-58
         */
        System.out.println(a);
        System.out.println(b);
    }
}