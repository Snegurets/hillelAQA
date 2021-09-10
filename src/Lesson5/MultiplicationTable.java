package Lesson5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a positive integer value: ");
        int number = sc.nextInt();
        multiplicationTableOfAGivenInteger(number);
    }

    public static void multiplicationTableOfAGivenInteger(int number){
        for (int i = 1; i <= 10; ++i) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }
}
