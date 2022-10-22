package class_assignment;
import java.util.Scanner;

public class fibonacii_series {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int t1, t2, t3, i;
        int n = input.nextInt();
        t1 = t2 = 1;
        System.out.print(t1 + " " + t2);
        for (i = 1; i <= n - 2; i++) {
            t3 = t1 + t2;
            System.out.print(" ");
            System.out.print(t3);
            t1 = t2;
            t2 = t3;
        }
    }
}