package Lesson3;

//Task 1
public class IF {
    public static void main(String[] args) {

    int time = 30;
    if (time > 18){
        System.out.println("Good evening.");
}}

public static class Ternary {
        public static void main(String[] args) {

            int time = 30;
            String result = (time > 18) ? "Good evening." : "Good day.";
            System.out.println(result);
        }
    }
}
