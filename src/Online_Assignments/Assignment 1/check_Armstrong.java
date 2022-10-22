package class_assignment;
import java.util.Scanner;

public class check_Armstrong {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number ");
        int num = input.nextInt();
        int i = num;
        int sum = 0;
        while (num > 0) {
            int r = num % 10;
            sum = sum + (r*r*r);
            num = num / 10;
        }
        if (sum == i) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not a Armstrong Number");
        }
    }
}
