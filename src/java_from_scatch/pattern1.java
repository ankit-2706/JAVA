package java_from_scatch;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter n");
        int n = input.nextInt();
        Pattern1(n);
        System.out.println();

        Pattern2(n);
        System.out.println();

        Pattern3(n);
        System.out.println();

        Pattern4(n);
        System.out.println();

        Pattern5(n);
        System.out.println();



    }
    static void Pattern1(int n) {
        for (int i = 1; i <= n; i++) {
            //for every row,run the column
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            //when one row is printed, we need to print new line
            System.out.println();
        }
    }
    static void Pattern2(int n) {
        for (int i = 1; i <= n; i++) {
            //for every row,run the column
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //when one row is printed, we need to print new line
            System.out.println();
        }
    }
    static void Pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            //for every row,run the column
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            //when one row is printed, we need to print new line
            System.out.println();
        }
    }
    static void Pattern4(int n) {
        for (int i = 0; i < 2*n; i++) {
            int totalcolumn = i>n ? 2*n-i : i;
            for (int j = 0; j < totalcolumn; j++) {
                System.out.print("*");
            }
            //when one row is printed, we need to print new line
            System.out.println();
        }
    }
     static void Pattern5(int n) {
        for (int i = 0; i <=n; i++) {

            for( int space=0; space<n-i; space++){
                System.out.println(" ");
            }

            for( int j=i; j>=1; j--){
                System.out.println( j + " ");
            }

            for( int j=2; j<=i; j++){
                System.out.println( j +" ");
            }
            //when one row is printed, we need to print new line
            System.out.println();
        }

    }
}



