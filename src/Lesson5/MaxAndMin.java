package Lesson5;

public class MaxAndMin {
    public static void main(String[] args) {
        int[] numbers = {3, 5, 2};
        int max = findMaxValueInArray(numbers);
        System.out.println("Max number is: " + max);
        int min = findMinValueInArray(numbers);
        System.out.println("Min number is: " + min);
        int sum = sumArrayElements(numbers);
        System.out.println("Sum of max and min is: " + sum);


    }

    public static int findMaxValueInArray(int[] array) {
        int maxValue = array[0];

        for (int number : array) {
            if (number > maxValue) {
                maxValue = number;
            }
        }
        return maxValue;
    }

    public static int findMinValueInArray(int[] array) {
        int minValue = array[0];

        for (int number : array) {
            if (number < minValue) {
                minValue = number;
            }
        }
        return minValue;
    }

    public static int sumArrayElements(int[] array) {
        int min = findMinValueInArray(array);
        int max = findMaxValueInArray(array);

        return min + max;
    }
}

