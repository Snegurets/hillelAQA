package Lesson4;

import java.util.Scanner;

public class NumberPowered {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = sc.nextInt();
        int power = 1;

        for (int i = 1; i <= secondNumber; i++) {
            power = power * firstNumber;
        }
        System.out.println("The value of " + firstNumber + " raised to the power of " + secondNumber + " is " + power);
    }

}
