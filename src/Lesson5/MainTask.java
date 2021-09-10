package Lesson5;

import java.util.Scanner;

public class MainTask {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter your name: ");
        String name = scan.nextLine();
        OperationsForHomework.personalizedGreeting(name);
//
        System.out.println("Please, enter your elements: ");
        int elements = Integer.parseInt(scan.nextLine());
        int[] numbers = OperationsForHomework.fillInArrayWithRandomNumbers(elements);
        OperationsForHomework.printArrayContents(numbers);

        int arr[] = numbers;
        int sum = OperationsForHomework.sumOfValuesOfTheGivenArray(arr);
        System.out.println("Array sum is " + sum);
        System.out.println("Array average is " + OperationsForHomework.averageValue(arr, sum));
        OperationsForHomework.multiplicationTableOfAGivenInteger(OperationsForHomework.averageValue(arr,sum));

        int number;
        do {
            System.out.println("Please enter your number: ");
            while (!scan.hasNextInt()) {
                System.out.println("Error. Try again.");
                scan.next();
            }
            number = scan.nextInt();
        } while (number < 10 || number > 1000);
        System.out.println(number);

        int reversed = OperationsForHomework.numberWithItsDigitsReversed(number);
        System.out.println(reversed);

        int power = OperationsForHomework.isPower(number,2);
        System.out.println("The value of " + number + " raised to the power of " + 2 + " is " + power);

        int rows = name.length();
        OperationsForHomework.maxNumberOfRows(String.valueOf(rows));


    }
}

