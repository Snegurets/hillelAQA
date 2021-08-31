package Lesson4;

import java.util.Scanner;

public class CountOfPositiveNegativeZerosEntered {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number;
        int positive = 0, negative = 0, zero = 0;

        char choice;

        do {
            System.out.println("Enter your number");
            number = sc.nextInt();

            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }
            System.out.println("Do you want to finish?");
            choice = sc.next().charAt(0);
        }
        while (choice == 'y' || choice == 'Y');
        System.out.println("You entered " + positive + " positive, " + negative + " negative and " + zero + " zero values.");
    }
}
