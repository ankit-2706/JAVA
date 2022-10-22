package class_assignment;
import java.util.Scanner;

public class power_2 {
    public static boolean is_power_of_two ( int n ) {
        //base case
        if( n==0 ){
            return false;
        }
        if( (n & n-1) == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        boolean result = is_power_of_two( n );
        if( result){
            System.out.println("This Number is power of 2 ");
        }
        else{
            System.out.println("This Number is not in power of 2 ");
        }
    }
}
