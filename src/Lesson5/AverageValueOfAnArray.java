package Lesson5;

public class AverageValueOfAnArray {
    public static void main(String[] args) {

        int sum = 0;
        int arr[] = {3,5,7};
        System.out.println(averageValue(arr, sum));
        float array[] = {3.0F,5.0F,7.0F};
        System.out.println(averageValue(array, sum));

    }

    public static int averageValue(int arr[], int sum) {
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
}