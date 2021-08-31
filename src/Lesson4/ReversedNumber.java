package Lesson4;

import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter this number: 54321");
        int number = scan.nextInt();
        int reversed = 0;

        while (number != 0) {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }
        System.out.println(reversed);
    }

}
