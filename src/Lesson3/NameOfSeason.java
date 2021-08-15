package Lesson3;

import java.util.Scanner;

//Task 2.2
public class NameOfSeason {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number of month");
        int month = sc.nextInt();

        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("It's a winter season!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("It's a spring season!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("It's a summer season!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("It's an autumn season!");
                break;
            default:
                System.out.println("Error. Please, enter a number between 1-12.");
                break;


        }
    }
}
