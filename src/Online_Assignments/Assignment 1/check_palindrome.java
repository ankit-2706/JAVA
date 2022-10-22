package class_assignment;
import java.util.Scanner;

public class check_palindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number ");
        int num = input.nextInt();
        int i = num;
        int p = 0;
        while (num > 0) {

            int r = num % 10;
            p = 10 * p + r;
            num = num / 10;

        }
        if (p == i) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }
}
