package Lesson6;

public class ReverseString {
    public static void main(String[] args){
        String toReverse = "Lesson6";
        System.out.println(reverseString(toReverse));
    }
    public static  String reverseString(String toReverse) {
        String result = "";

        for ( int i = toReverse.length() - 1; i >= 0; i--) {
            result += toReverse.charAt(i);
        }
        return result;
    }
}
