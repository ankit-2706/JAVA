package Online_Assignments;
import java.util.*;

public class quadratic {
    public static void main(String[] args) {

        Double a, b, c;
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Enter the coefficients of the quadratic equation");
            a = input.nextDouble();
            b = input.nextDouble();
            c = input.nextDouble();
        }
        catch (Exception e) {
            System.out.println("An error occurred");
            return;
        }
        double determinant = Math.pow(b, 2) - 4 * a * c;
        if (determinant > 0) {
            System.out.println("Roots are " + (-b + Math.sqrt(determinant)) / (2 * a)
                    + " and " + (-b - Math.sqrt(determinant)) / (2 * a));
        } else if (determinant == 0) {
            System.out.println("Roots are " + -b / (2 * a));
        } else {
            System.out.println("Roots are " + -b / (2 * a) + "+i" +
                    Math.sqrt(-determinant) / (2 * a) + " and "
                    + -b / (2 * a) + "-i" + Math.sqrt(-determinant) / (2 * a));
        }
    }
}
