package class_assignment;
                            // Find out MINIMUM NUMBER of an Array..
import java.util.Scanner;

public class AS6 {

    public static void main(String[] args) {


//        Scanner input= new Scanner(System.in);
//        System.out.println("Enter the size of the Array:");
//        int n = input.nextInt();
//        int a[] = new int[n];
//        System.out.println("Enter the elements of the Array:");
//        for( int i=0; i<n; i++ ){
//            a[i] = input.nextInt();
//        }

        // Better way to do.

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int n = input.nextInt();

        //Declaring array of n elements,the value of n is provided by the user.
        int a[] = new int[n];
        for( int i=0; i<n; i++ ){
            //taking numbers from user.
            System.out.print("Enter Element No." + ( i)+" : " );
            a[i] = input.nextInt();
        }
        // comparing the numbers
        int min = a[0];
        for( int i=0; i<n; i++ ){
            if( min > a[i]){
                min = a[i];
            }
        }
        System.out.println("Minimum number is: " + min);
    }
}
