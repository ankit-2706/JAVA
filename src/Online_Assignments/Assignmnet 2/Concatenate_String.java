package Online_Assignments;
import java.util.Scanner;

public class Concatenate_String {
    public static void main(String[] args) {

//       System.out.println("Enter any String:");
        Scanner input = new Scanner(System.in);

        //taking string input from user
        System.out.println("Enter 1st String->");
        String s1 = input.nextLine();

        System.out.println("Enter 2nd String->");
        String s2 = input.nextLine();

//        String s1= "java";
//        String s2= "programming";

        //Method 1
//        String s3 = s1+s2;
//        System.out.println("After Concatenate: " + s3);

        //Method2
        String s3= s1.concat(s2);
        System.out.println("After Concatenate: " + s3);
    }
}
