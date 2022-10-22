package Online_Assignments;

import java.util.Scanner;

public class Remove_white_space {
    public static void main(String[] args) {

        //taking input from user
        System.out.println("Enter any String:");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        //replacing space with nothing
        s=s.replace(" ","");

        System.out.println("String after white space removed: "+ s);
    }
}
