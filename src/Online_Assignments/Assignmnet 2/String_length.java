package Online_Assignments;

import java.util.Scanner;

public class String_length {
    public static void main(String[] args) {

        //taking input from user
        System.out.println("Enter any String:");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        //storing string into character array
        char arr[] = s.toCharArray();
        int count=0;
        for(char ch : arr){
            count++;
        }

        System.out.println("String Length: " + count );
    }
}
