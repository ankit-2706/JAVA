package class_assignment;

import java.util.Scanner;

public class AS8 {


    public static void main(String[] args) {

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

        System.out.print("Prime numbers are:");
        // count -> to calculate no. of Prime numbers..
        // Sum -> to calculate the sum of prime numbers.
        int count = 0 , sum = 0, max=a[0];
        // loop for travelling along each numbers
        for( int i = 0; i<n; i++ ){
            boolean is_prime = true;

            // checking whether the number is prime or not!!
            for( int j=2; j<a[i];j++ ){
                if( a[i] % j == 0 ){
                    is_prime = false;
                    break;
                }
            }
            if( is_prime ) {
//                for(  i=0; i<n; i++ ){
////            //comparing the numbers.
//            if( max < a[i]){
//                max = a[i];
//            }
        }

                if( a[0]<a[i]){
                    a[0]= a[i];
                }

                System.out.print(a[i] + " ");
                sum = sum + a[i];
                count++;

        }
         System.out.println();

//        System.out.println( "Count= " + count );
        System.out.println( "Sum= " + sum );
        float average = (float)sum/count;
        System.out.println("Average of Prime numbers is:" + average );
        System.out.println("Maximum of Prime numbers is: " + a[0]);

//        int max = a[0];
//        for( int i=0; i<n; i++ ){
//            //comparing the numbers.
//            if( max < a[i]){
//                max = a[i];
//            }
//        }

    }
}
