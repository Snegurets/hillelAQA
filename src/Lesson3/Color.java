package Lesson3;

import java.util.Scanner;

public class Color {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a color ");
        String color = sc.nextLine();

        switch (color) {
            case "red":
                System.out.println("3");
                break;
            case "blue":
            case "pink":
                System.out.println("4");
                break;
            case "green":
            case "black":
            case "white":
                System.out.println("5");
                break;
            case "yellow":
            case "orange":
                System.out.println("6");
                break;

        }

    }
}
