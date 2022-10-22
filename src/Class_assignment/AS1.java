package class_assignment;
                            //Palindrome_String
import java.util.Scanner;

public class AS1 {
    public static boolean Checkpalindrome(String input) {
        int i = 0;
        int j = input.length() - 1;

        while (i < j) {
            if (input.charAt(i) != input.charAt(j)) {
                return false;
            } else {
                ++i;
                --j;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String input= "abba" ;
        System.out.println( Checkpalindrome(input) );

    }
}
