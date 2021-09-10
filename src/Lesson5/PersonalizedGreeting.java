package Lesson5;

import java.util.Scanner;

public class PersonalizedGreeting {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please, enter your name: ");
        String name = scan.nextLine();
        personalizedGreeting(name);
    }
    public static void personalizedGreeting(String name){
        System.out.println("Hello, " + name + "!");
    }
}
