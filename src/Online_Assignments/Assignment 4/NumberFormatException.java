package Online_Assignments;
import java.util.*;

public class NumberFormatException {
    public static void main(String[] args) {
        int age;
        Scanner input = new Scanner(System.in);
        try{
            System.out.println("Enter your age");
            age = Integer.parseInt(input.next());
            System.out.println("Your age is :" + age);
        }
        catch(java.lang.NumberFormatException e){
            System.out.println("The NumberFormatException occur.");
            System.out.println("Try to enter valid age.");
        }
    }
}
