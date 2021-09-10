package Lesson5;

import java.util.Scanner;

public class ValidationNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number;
        do {
            System.out.println("Please enter your number: ");
            while (!scan.hasNextInt()) {
                System.out.println("Error. Try again.");
                scan.next();
            }
            number = scan.nextInt();
        } while (number < 10 || number > 1000);
        System.out.println(number);
    }
}
