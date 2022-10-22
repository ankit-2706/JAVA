package Online_Assignments;
import java.util.*;
public class Division {
    public String Div( int n1,int n2) {

        String str = " ";

        try {
            int val = n1 / n2;
            System.out.println("The answer is : " + val);
        }
        catch (ArithmeticException e) {
            str = "Division of Zero is not possible";
        }

        finally{
            return(str+"\n Thanks for using the application.");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        Division d = new Division();
        System.out.println(d.Div(n1,n2));

    }
}
