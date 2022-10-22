package Online_Assignments;

import java.util.Scanner;

public class Find_Occurances {
    public static void main(String[] args) {

        //taking string input from user
        System.out.println("Enter any String:");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        String original = s;
        s=s.toLowerCase();

        System.out.println("Enter the character whose occurrence you need to find:");
        String ch = input.nextLine().toLowerCase();

        int l1 = s.length();
        s.replace(ch,"") ;
        int l2= s.replace(ch,"").length();

        int count= l1-l2;
        System.out.println("Occurance of " + ch + " is = " + count);

    }
}



