package pl.even_number;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("Enter first number:");

        int firstNo = number.nextInt();

        System.out.println("Enter last number:");

        int secondNo = number.nextInt();

        System.out.println("Even numbers in your array are: ");
        for (int i = firstNo; i <= secondNo; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " ");
            }
        }
    }

}
