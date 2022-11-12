import java.util.Scanner;

public class percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // float subject1, subject2, subject3, subject4, subject5;
        System.out.println("Enter 1st subject marks");
        float subject1 = sc.nextFloat();
        System.out.println("Enter 2nd subject marks");
        float subject2 = sc.nextFloat();
        System.out.println("Enter 3rd subject marks");
        float subject3 = sc.nextFloat();
        System.out.println("Enter 4th subject marks");
        float subject4 = sc.nextFloat();
        System.out.println("Enter 5th subject marks");
        float subject5 = sc.nextFloat();
        float CGPA = (subject1 + subject2 + subject3 + subject4 + subject5) / 5;
        System.out.println("Percentage of marks is:");
        System.out.println(CGPA);

    }
}
