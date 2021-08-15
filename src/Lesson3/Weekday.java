package Lesson3;

import java.util.Scanner;

//Task 3
public class Weekday {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weekday number");
        int weekday = sc.nextInt();
        if (weekday == 1) {
            System.out.println("Monday");
        } else if (weekday == 2) {
            System.out.println("Tuesday");
        } else if (weekday == 3) {
            System.out.println("Wednesday");
        } else if (weekday == 4) {
            System.out.println("Thursday");
        } else if (weekday == 5) {
            System.out.println("Friday");
        } else if (weekday == 6) {
            System.out.println("Saturday");
        } else if (weekday == 7) {
            System.out.println("Sunday");
        } else {
            System.out.println("Error. Please, enter a number between 1-7.");
        }
    }
}
