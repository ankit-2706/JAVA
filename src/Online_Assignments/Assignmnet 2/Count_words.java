package Online_Assignments;

import java.util.Scanner;

public class Count_words {
    public static void main(String[] args) {
        System.out.println("Enter any String:");
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
         int count=1;
        for(int i=0; i<s.length()-1;i++){
            if((s.charAt(i)==' ') && (s.charAt(i+1)!=' ')){
                count++;
            }
        }
        System.out.println("Total number of words are: " + count);
    }

}
