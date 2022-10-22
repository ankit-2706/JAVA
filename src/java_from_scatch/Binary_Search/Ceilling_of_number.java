package java_from_scatch.Binary_Search;
import java.util.Scanner;         //CEILLING OF NUMBER
                                  // we need to find smallest number >= target number
//if arr={1,2,5,7,9} & target=6
// Ans= returns index of 7(i.e-


public class Ceilling_of_number {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = input.nextInt();

        //array
        int arr[] = new int[n];
        //taking inputs from user
        System.out.println("Enter the Numbers");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }

        //taking target element from user
        System.out.println("Enter the target element");
        int target = input.nextInt();

        //Function which takes array name and target element as its parameters
        int ans = Ceilling_of_Number(arr, target);
        System.out.println(ans);

    }
    static int Ceilling_of_Number(int arr[], int target){

        //base case
        if(target > arr[arr.length-1]){
            return -1;
        }

        int start = 0;
        int end = arr.length-1;

        while(start<=end){
            //finding middle element
//            int mid = (start+end)/2; -> there is possiblity that (start+end) exceeds the range of int
            int mid = start+(end-start)/2;
            //cheking on left side
            if( target<arr[mid] ){
                end = mid-1;
            }
            //checking on right side
            else if( target>arr[mid] ){
                start=mid+1;
            }
            else {
                return mid; //answer
            }
        }
        //if after traversing through whole array,target element not found,return -1
        return start;
    }

}
