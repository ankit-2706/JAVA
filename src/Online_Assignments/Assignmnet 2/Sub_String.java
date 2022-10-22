package Online_Assignments;

import java.util.Scanner;

public class Sub_String {
    public static void main(String[] args) {

        //taking string input from user
        System.out.println("Enter any String:");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        //using substring function
        System.out.println(s.substring(1,5));
    }
}
