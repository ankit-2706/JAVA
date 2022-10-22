package java_from_scatch;
import java.util.Scanner;                //COUNT & REVERSE


public class p12 {
    public static void main(String[] args) {
//        int n = 1233332567;
//
//        int count = 0;
//        while (n > 0) {
//            int rem = n % 10;
//            if (rem == 3) {
//                count++;
//            }
//            n = n / 10; // n /= 10
//        }
//        System.out.println(count);

            //taking input from user
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter any number ");
//        int num = input.nextInt();
//        System.out.println("Enter the number that you want to count");
//        int num_to_count = input.nextInt();
//        int count = 0;
//        while( num > 0 ){
//            int r = num%10;
//            if( r==num_to_count){
//                count++;
//            }
//            num = num/10;
//        }
//        System.out.println("Count= "+ count);
//
        //Reverse of a Number.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter any number ");
        int num = input.nextInt();
        int rev = 0;
        while( num > 0 ){
            int r = num%10;
             rev = 10*rev +r;
            num = num/10;
        }
        System.out.println("Reverse of Number is-> "+ rev);

    }
}
