package class_assignment;
import java.util.Scanner;

public class Circle {
    static double get_diameter( double r ){
        return 2*r;
    }
    static double get_circumference( double r ){
        return 2*3.14*r;
    }
    static double get_area( double r ){
        return 3.14*r*r;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of Circle:");
        double r = input.nextDouble();

        System.out.println("Diameter:" + get_diameter( r) );
        System.out.println("Circumference:" + get_circumference( r) );
        System.out.println("Area:" + get_area( r) );
    }
}
