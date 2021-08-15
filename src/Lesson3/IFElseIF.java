package Lesson3;

import java.util.Scanner;

//Task 2
public class IFElseIF {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a time");
        int time = sc.nextInt();
        if (time > 18) {
            System.out.println("Good evening");
        } else if (time < 10) {
            System.out.println("Good morning");
        } else {
            System.out.println("Good day");
        }
    }
}
