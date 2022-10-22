package Online_Assignments;

import java.util.Scanner;

public class Count_char {
    public static void main(String[] args) {

        //taking string input from user
        System.out.println("Enter any String:");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        int count=0;
        for(int i=0; i<s.length();i++){
            if(s.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("Total number of words are: " + count);
    }
}
