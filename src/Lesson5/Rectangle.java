package Lesson5;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {

        Scanner scan  = new Scanner(System.in);

        System.out.println("Enter the height: ");
        int height = scan.nextInt();
        System.out.println("Enter the width: ");
        int width = scan.nextInt();
        rectangle (height, width);
    }
    public static void rectangle (int height, int width){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
