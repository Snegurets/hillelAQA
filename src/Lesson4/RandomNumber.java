package Lesson4;

import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = (int) (Math.random() * 10) + 1;
        int usersGuess = 0;

        do {
            System.out.println("What the number is?");
            usersGuess = sc.nextInt();

            if (usersGuess < number) {
                System.out.println("Too high, try again.");
            } else if (usersGuess > number) {
                System.out.println("Too low, try again");
            } else {
                System.out.println("Guessed the correct number!");
            }
        } while (usersGuess != number);
    }
}
