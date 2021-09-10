package Lesson5;

import java.util.Scanner;

public class ArrayRandomly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter qty of elements: ");
        int elements = sc.nextInt();

        int[] numbers = fillInArrayWithRandomNumbers(elements);
        printArrayContents(numbers);

    }

    public static int[] fillInArrayWithRandomNumbers(int arraySize) {
        int[] array = new int[arraySize];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 20) + 1;
        }
        return array;
    }

    public static void printArrayContents(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i]);
            } else {
                System.out.print(array[i] + " ");
            }
        }
    }
}

