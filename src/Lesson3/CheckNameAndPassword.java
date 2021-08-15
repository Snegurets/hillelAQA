package Lesson3;

//Task 5
public class CheckNameAndPassword {
    public static void main(String[] args) {

       String name = "";
       if (name.isEmpty()) {
           System.out.println("Error. Name is empty.");
        }

       String password = "pass12";
       int a = 5;
       if (password.length() >= a) {
           System.out.println("Error. Wrong pass.");
       }
    }
}
