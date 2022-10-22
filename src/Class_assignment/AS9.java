package class_assignment;
import java.util.Arrays;             //BUBBLE_SORT

public class AS9 {
    static void bubble_sort( int arr[]) {
        boolean swapped;
        // for the passes(rounds)
        for (int i = 0; i < arr.length; i++) {
            swapped = false;
            //for comparisions for each step,max item will come at the respective Index
            for ( int j = 1 ; j< arr.length - i; j++) {
                //we do swaping if the  previous number is greater than the next number
                if( arr[j] > arr[ j+1 ]){
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                    swapped = true ;
                }
            }
            //if you did not swap for a particular value of i,it means the array is sorted hence,stop the program.
            if(swapped==false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = { 7,6,5,4,3,2,1} ;
        bubble_sort( arr);
        System.out.println("Sorted array --> " + Arrays.toString( arr));
    }

}
