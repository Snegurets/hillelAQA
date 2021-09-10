package Lesson5;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter qty of elements: ");
        int elements = sc.nextInt();
        int[] arr = new int[elements];
        contentsOfTheArray(arr);
    }
    public static void contentsOfTheArray( int [] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
            } else {
                System.out.print(arr[i] + ", ");
            }
        }
    }
}
