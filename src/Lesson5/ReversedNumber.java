package Lesson5;

import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter this number: 54321");
        int number = sc.nextInt();
        int reversed = numberWithItsDigitsReversed(number);
        System.out.println(reversed);
    }
    public static int numberWithItsDigitsReversed(int number) {
        int reversed = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }
        return reversed;
    }

}
