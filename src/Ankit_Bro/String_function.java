package Ankit_Bro;


//STRING FUNCTIONS TO PRINT ARRAY ELEMENTS.

/*  toString()   asList()    deepToString */

// these 3 are the Static methods to print elements of an array..
// takes array varriable as arguments...
// * toString()--> best to use...to print array elements without using loop..
// * asList()--> gives references,,
// * deepToString()--> to print elements of 2-D arrays..

import java.net.SocketOption;
import java.util.Arrays;
public class String_function {
    public static void main(String[] args) {

        String a[] = { "Ankit" , "Coding" , "keyword" , "Education"};
        System.out.println("toString() " + Arrays.toString(a));
        System.out.println("asList() " + Arrays.asList(a));
        System.out.println("deepToString() " + Arrays.deepToString(a));

        int arr[][] = { {10,20},{30,40} };
        System.out.println("deepToString() " + Arrays.deepToString(arr) );


    }

}