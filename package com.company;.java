package com.company;

import java.util.Scanner;

public class Taking_Input {
    public static void main(String[] args) {
        System.out.println("Taking Input frome user");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number1");
        int a = sc.nextInt();
        System.out.println("Enter number 2");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The sum of these number is:");
        System.out.println(sum);

        // Import java.util.Scanner;

    }
}