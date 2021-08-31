package Lesson4;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter a positive integer value: ");
            number = sc.nextInt();
            if (number < 0 && i == 2) {
                System.out.println("Error. Try again.");
                return;
            } else if (number < 0) {
                System.out.println("Error.");
            } else {
                break;
            }
        }

        for (int j = 1; j <= 5; ++j) {
                System.out.println(number + "*" + j + "=" + number * j);
        }
    }
}
