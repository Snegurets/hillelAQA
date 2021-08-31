package Lesson4;

import java.util.Scanner;

public class MaxNumberOfRows {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            String rows = "";

            for (int i = 0; i < 4; i++) {
                System.out.println("Enter the number of rows: ");
                rows = sc.nextLine();

                if ((rows.isEmpty() || Integer.parseInt(rows) < 0) && i == 3){
                    System.out.println("Error. Try again.");
                    return;
                } else if (rows.isEmpty()) {
                    System.out.println("Error. Empty number.");
                } else if (Integer.parseInt(rows) < 0) {
                    System.out.println("Error. Negative number.");
                } else {
                    break;
                }
            }

            for (int j = 0; j < Integer.parseInt(rows); j++) {
                for (int h = 0; h <= j; h++) {
                    if (h == 0){
                        System.out.print("##");
                    } else {
                        System.out.print("#");
                    }
                }
                System.out.println();
            }
        }
    }
