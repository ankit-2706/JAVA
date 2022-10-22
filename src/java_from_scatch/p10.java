package java_from_scatch;
import java.util.Scanner;
                           // Checking Uppercase and Lowercase
public class p10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any character");
        char c = input.next().trim().charAt(0);
        if( c>='a' && c<='z'){
            System.out.println("Lowercase");
        }
        else if( c>='A' && c<='Z'){
            System.out.println("Uppercase");
        }
        else{
            System.out.println("");
        }

    }
}
