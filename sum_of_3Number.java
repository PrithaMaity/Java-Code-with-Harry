import java.util.Scanner;

public class sum_of_3Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a = sc.nextInt();
        System.out.println("Enter 1st number:");
        int b = sc.nextInt();
        System.out.println("Enter 1st number:");
        int c = sc.nextInt();
        int sum = (a + b + c);
        System.out.println("Sum of three number is:");
        System.out.println(sum);

    }
}