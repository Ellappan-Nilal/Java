import java.util.*;
public class Cricle {
    public static void main(String[] args) {

        double radius = 7;
        double area = Math.PI * radius * radius;
        double circumference = 2 * Math.PI * radius;

        System.out.println("Radius = " + radius);
        System.out.printf("Area = %.2f%n", area);
        System.out.printf("Circumference = %.2f%n", circumference);
    }
}

