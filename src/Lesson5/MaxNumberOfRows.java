package Lesson5;

import java.util.Scanner;

public class MaxNumberOfRows {
    public static void main(String[] args) {

        String rows = "";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        rows = sc.nextLine();
        maxNumberOfRows(rows);
    }

    public static void maxNumberOfRows(String rows) {
        for (int j = 0; j < Integer.parseInt(rows); j++) {
            for (int h = 0; h <= j; h++) {
                if (h == 0) {
                    System.out.print("##");
                } else {
                    System.out.print("#");
                }
            }
            System.out.println();
        }
    }
}
