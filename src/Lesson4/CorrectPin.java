package Lesson4;

import java.util.Scanner;

public class CorrectPin {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        int correctPin = 100;

        for (int counter = 0; counter < 3; counter++) {
            System.out.println("Enter pin: ");
            int userPin = sc.nextInt();
         if ((userPin != correctPin) && counter == 2) {
            System.out.println("Sorry but you have been locked out.");
            return;
         } else if (userPin != correctPin)  {
            System.out.println("Incorrect, try again.");
         } else {
            System.out.println("Correct, welcome back.");
            break;
         }
        }
    }
}


