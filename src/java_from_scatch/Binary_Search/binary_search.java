package java_from_scatch.Binary_Search;
import java.lang.annotation.Target;
import java.util.Scanner;

                                              //BINARY SEARCH

//Requirement: Sorted Array {Ascending or Descending}
// STEPS--> 1)Find the middle
//          2)if Target element == mid element, returns mid as Ans
//          3)if Target element > mid element, search in the right most part
//          4)if Target element < mid element, search in the left most part

//Assuming Array to be in ascending order

public class binary_search {
    public static void main(String[] args) {

//        int[] nums = {-1,0,4,5,8,9,11,13,16,19,33};
//        int target = 19;

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
        int ans = Binary_Search(arr, target);
        System.out.println(ans);

    }
    //Returns the index of corresponding ans
    //Returns -1 is element not found
        static int Binary_Search(int arr[], int target){

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
            return -1;
        }
}


// when Array is given in Descending order

//           static int Binary_Search(int arr[],int target) {
//               int start = 0;
//               int end = arr.length - 1;
//
//               while (start <= end) {
//                   //finding middle element
////        int mid = (start+end)/2; -> there is possiblity that (start+end) exceeds the range of int
//                   int mid = start + (end - start) / 2;
//                   //cheking on left side
//                   if ( target>arr[mid]) {
//                       end = mid - 1;
//                   }
//                   //checking on right side
//                   else if (target < arr[mid]) {
//                       start = mid + 1;
//                   } else {
//                       return mid; //answer
//                   }
//               }
//               //if after traversing through whole array,target element not found,return -1
//               return -1;
//           }
//}





































//
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
//        int target = 22;
//        int ans = binarySearch(arr, target);
//        System.out.println(ans);
//        }
//
//     // return the index
//     // return -1 if it does not exist
      //static int binarySearch(int[] arr, int target) {
//        int start = 0;
//        int end = arr.length - 1;
//
//        while(start <= end) {
//        // find the middle element
////            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//        int mid = start + (end - start) / 2;
//
//        if (target < arr[mid]) {
//        end = mid - 1;
//        } else if (target > arr[mid]) {
//        start = mid + 1;
//        } else {
//        // ans found
//        return mid;
//        }
//        }
//        return -1;