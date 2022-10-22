package Linear_Search;
import java.util.Scanner;

                                    //BASIC PROGRAM - LINEAR SEARCH

public class Main {
    public static void main(String[] args) {

//        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
//        int target = 19;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = input.nextInt();

        //array
        int nums[] = new int[n];
        //taking inputs from user
        System.out.println("Enter the Numbers");
        for(int i=0; i<nums.length; i++){
            nums[i] = input.nextInt();
        }

        //taking target element from user
        System.out.println("Enter the target element");
        int target = input.nextInt();

        //Function which takes array name and target element as its parameters
        boolean ans = linearSearch3(nums, target);
        System.out.println(ans);
    }

    // search the target and return true or false
    static boolean linearSearch3(int[] arr, int target) {
        //for empty list
        if (arr.length == 0) {
            return false;
        }

        // run a for loop
        //enhanced for lopp,i.e, for each loop use hua hai!
        //array k elements
        for (int element : arr) {
            if (element == target) {
                return true;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return false;
    }

    // search the target and return the element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int element : arr) {
            if (element == target) {
                return element;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return Integer.MAX_VALUE;
    }

    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        // this line will execute if none of the return statements above have executed
        // hence the target not found
        return -1;
    }
}
