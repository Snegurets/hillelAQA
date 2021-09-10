package Lesson5;

public class IsEven {
    public static void main(String[] args) {
        System.out.println(isEven(6));
    }

    public static boolean isEven (int number){

//        if (number % 2 == 0){
//            return true;
//        } else {
//            return false;
//       }
        return number % 2 == 0;
    }
}
