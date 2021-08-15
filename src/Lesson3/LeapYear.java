package Lesson3;

import java.util.Scanner;

//Task 2.1
public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

       boolean a = (year % 4) != 0;
       boolean b = (year % 100) == 0;
       boolean c = ((year % 100) != 0 && ( year % 400 ) != 0);

       if (a && (b || c)) {
            System.out.println("Year "+ year + " is not a leap year.");
       } else {
           System.out.println("Year " + year + " is a leap year.");
       }




    }
}
