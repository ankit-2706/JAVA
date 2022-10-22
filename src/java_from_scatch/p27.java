package java_from_scatch;             //Palindrome String
import java.util.Scanner;
public class p27 {
    public static void main(String[] args) {

        //taking input string from the user
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any String:");
        String str = input.next();
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        str = str.toLowerCase();
        for (int i = 0; i <= str.length() / 2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            //comparing the characters
            if (start != end) {
                return false;
            }
        }
        return true;
    }
}
