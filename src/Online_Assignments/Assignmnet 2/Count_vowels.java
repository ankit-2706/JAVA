package Online_Assignments;

import java.util.Scanner;

public class Count_vowels {
    public static void main(String[] args) {

        //taking string input from user
        System.out.println("Enter any String:");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine().toLowerCase();
        char arr[]=s.toCharArray();
        int count=0;
        for(char c : arr){

            switch(c){

                case 'a' :
                case 'e' :
                case 'i' :
                case 'o':
                case 'u':

                    count++;
                    break;

            }
        }
        System.out.println("Total No. of vowels are: "+ count);
    }
}
