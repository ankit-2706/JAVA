package class_assignment;
                              // Find out MAX NUMBER from Array..
import java.util.Scanner;

public class AS5 {

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
        int max = a[0];
        for( int i=0; i<n; i++ ){
            //comparing the numbers.
            if( max < a[i]){
                max = a[i];
            }
        }
        System.out.println("Maximum number is: " + max);
    }
}

    //BASICS

//    double[] arr = {19, 12.89, 16.5, 200, 13.7};
//    double total = 0;
//
//        for(int i=0; i<arr.length; i++){
//        total = total + arr[i];
//        }
//
//
//        /* arr.length returns the number of elements
//         * present in the array
//         */
//        double average = total / arr.length;
//
//        /* This is used for displaying the formatted output
//         * if you give %.4f then the output would have 4 digits
//         * after decimal point.
//         */
//        System.out.format("The average is: %.3f", average);



        //USER BASED INPUT

//System.out.println("How many numbers you want to enter?");
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        /* Declaring array of n elements, the value
//         * of n is provided by the user
//         */
//        double[] arr = new double[n];
//        double total = 0;
//
//        for(int i=0; i<arr.length; i++){
//        System.out.print("Enter Element No."+(i+1)+": ");
//        arr[i] = scanner.nextDouble();
//        }
//        scanner.close();
//        for(int i=0; i<arr.length; i++){
//        total = total + arr[i];
//        }
//
//
//
//        double average = total / arr.length;
//
//        System.out.format("The average is: %.3f", average);
