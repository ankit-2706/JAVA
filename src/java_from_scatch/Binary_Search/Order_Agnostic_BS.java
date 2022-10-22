package java_from_scatch.Binary_Search;
import java.util.Scanner;

                                         //ORDERED_AGNOSTIC_BINARY_SEARCH

public class Order_Agnostic_BS {
    public static void main(String[] args) {

        //Taking input from the user
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
        int ans = Agnostic_BS(arr, target);
        System.out.println(ans);

    }

    static int Agnostic_BS(int arr[],int target) {
        int start = 0;
        int end = arr.length - 1;

        //find whether array is Sorted or not
        boolean isAsc = arr[start]<= arr[end];

        while (start <= end) {
            //finding middle element
//        int mid = (start+end)/2; -> there is possiblity that (start+end) exceeds the range of int
            int mid = start + (end - start) / 2;

            //taking out common  case
            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                }
                //checking on right side
                else if (target > arr[mid]) {
                    start = mid + 1;
                }
            } else {
                //check for left side
                if (target > arr[mid]) {
                    end = mid - 1;
                }
                //checking on right side
                else if (target < arr[mid]) {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}











