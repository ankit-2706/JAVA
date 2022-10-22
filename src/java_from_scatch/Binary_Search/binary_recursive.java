package java_from_scatch.Binary_Search;
import java.util.Scanner;
                               //BINARY SEARCH(RECURSION)

public class binary_recursive {
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

        System.out.println("Enter starting index:");
        int s = input.nextInt();

        //taking target element from user
        System.out.println("Enter the target element");
        int target = input.nextInt();

        //Function which takes array name and target element as its parameters
        boolean ans = binary_search_rec(arr, s, n, target);
        System.out.println(ans);


    }

     static boolean binary_search_rec(int arr[],int s,int n, int target){
        //base case
         if(s>n){
             return false;
         }
         int mid = (s+n)/2;

         //comparing target and middle element5
         if(target==arr[mid]){
             return true;
         }
         if(target>arr[mid]){
             return binary_search_rec(arr,mid+1,n,target);
         }
         else{
             return binary_search_rec(arr,s,mid-1,target);
         }

     }

}
