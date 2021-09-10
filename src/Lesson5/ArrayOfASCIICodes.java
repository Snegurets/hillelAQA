package Lesson5;

public class ArrayOfASCIICodes {
    public static void main(String[] args) {
        char [] arr = {'#', 'a', '@', '!', 'B', '/'};
        returnsAnArrayOfASCIICodes(arr);

    }
    public static void returnsAnArrayOfASCIICodes(char[] arr) {
        for (int elements : arr) {
            System.out.println(elements);
        }
    }
}
