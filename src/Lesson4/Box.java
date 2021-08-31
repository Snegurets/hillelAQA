package Lesson4;

import java.util.Scanner;

public class Box {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the height: ");
        int height = scan.nextInt();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the width: ");
        int width = sc.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}



