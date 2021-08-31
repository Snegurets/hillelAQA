package Lesson4;

public class AverageValueOfAnArray {
    public static void main(String[] args) {

        int arr[] = {3,5,7};
        int sum = 0;
        int average = 0;

        for (int i : arr ) {
            sum = sum + i;
            average = sum / arr.length;
        }
        System.out.println("Average of our array is: " + average);
    }
}
