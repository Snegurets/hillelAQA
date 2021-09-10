package Lesson5;

public class OperationsForHomework {

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

    public static int isPower(int firstNumber, int secondNumber) {
        int power = 1;
        for (int i = 1; i <= secondNumber; i++) {
            power = power * firstNumber;
        }
        return power;
    }

    public static int numberWithItsDigitsReversed(int number) {
        int reversed = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversed = reversed * 10 + remainder;
            number = number / 10;
        }
        return reversed;
    }

    public static int sumOfValuesOfTheGivenArray (int arr []){
        int sum = 0;
        for (int i : arr) {
            sum = sum + i;
        }
        return sum;
    }

    public static int averageValue(int[] arr, int sum) {
        for (int i : arr) {
            sum = sum + i;
        }
        return sum / arr.length;
    }

    public static float averageValue(float array[], float sum){
        for (float i : array) {
            sum = sum + i;
        }
        return sum / array.length;
    }

    public static void multiplicationTableOfAGivenInteger(int number){
        for (int i = 1; i <= 10; ++i) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
    }

    public static String maxNumberOfRows(String rows) {
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
        return rows;
    }

    public static void rectangle (int height, int width){
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void personalizedGreeting(String name){
        System.out.println("Hello, " + name + "!");
    }

    public static void contentsOfTheArray(int [] arr) {
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