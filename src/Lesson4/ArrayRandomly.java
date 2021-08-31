package Lesson4;

import java.util.Scanner;

public class ArrayRandomly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter qty of elements: ");
        int elements = sc.nextInt();

        int[] arr = new int[elements];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
            System.out.print(arr[i] + " ");
        }
    }
}
