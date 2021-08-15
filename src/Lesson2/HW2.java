package Lesson2;

public class HW2 {

    public static void main(String[] args) {
        int inch = 1000;
        double meter = 0.0254;
        double a = inch;
        double b = a * meter;
        System.out.println(a);
        System.out.println(b);

        int minutes = 3456789;
        int y = 60 * 24 * 365;
        int year = minutes / y;
        System.out.println(year + " years");
        int minutes2 = minutes - (year * y);
        int y2 = 60 * 24;
        int days = minutes2 / y2;
        System.out.println(days + " days");

        int pounds = 452;
        int inches = 72;
        double weight = pounds * 0.4535923745;
        double height = inches * meter * inches * meter;
        double BMI = weight / height;
        System.out.println("Body Mass Index is " + BMI);

        float d = 2500;
        float h = 5;
        float m = 56;
        float s = 23;
        float timeSeconds = (h * 3600) + (m * 60) + s;
        float ms = d / timeSeconds;
        float kmh = (d / 1000.0f) / (timeSeconds / 3600.0f);
        System.out.println("Your speed in m/s is " + ms);
        System.out.println("Your speed in km/h is " + kmh);
    }
}