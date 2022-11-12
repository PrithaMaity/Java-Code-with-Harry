import java.util.Scanner;

public class kilometer_to_miles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your length in kilometer");
        float kilometer = sc.nextFloat();
        double miles = kilometer / 1.609;
        System.out.println("Your length is:");
        System.out.println(miles);
    }
}