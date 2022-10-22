package java_from_scatch;


                                         //GIVING INPUTS..
import java.util.Scanner;

public class P3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please Enter your name:");
        String  name = input.nextLine();
        System.out.println("your name is " +  name);
        System.out.println("please Enter your rollnumber:");

        //--> if we write here flaot ,then it will convert the int value into flaot .
        float rollno = input.nextFloat();
        System.out.println(rollno);

        System.out.println("your rollnumber is " +  rollno );
        System.out.println("please Enter your marks:");
        int marks = input.nextInt();
        System.out.println("your marks is "  +  marks);
    }
}

