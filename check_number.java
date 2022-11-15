import java.util.Scanner;

public class check_number {
    public static void main(String[] args) {
        System.out.println("Taking input from the user");
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int a = sc.nextInt();
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }

}