package java_from_scatch.Binary_Search.Leet;
// https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
// Given arr = {1,2,3,4,5,6,7,8,9,11,12,13,14,15......till infinite} & Target = 2
//Answer = returns 1 as 1 is the index of element 2

//NOTE: by infinite numbers,we means that we cannot use arr.length method to find end index

//APPROACH
//This problem is solved by making chunks of boxes starting with size 2 and then doubling the box size each time
//firstly we need to find out that whether the target element lie inside box or not
//If target element lie inside box,apply Binary Search
//If target element lie outside box,just double the size of box & search in that

public class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = {3,5,7,9,10,90,100,130,140,168,170};
        int target = 10;
        System.out.println(ans(arr,target));
    }
    static int ans( int arr[],int target){
        //first find the range
        //first start with a size of box 2,then 4,then 8->doubling each time size of box
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while( target>arr[end]) {
            int temp = end + 1; //this is my new start
            //double the box value
            //end = previous end  + (size of box)*2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binary_search(arr,target,start,end);
    }
    static int binary_search( int arr[],int target, int start, int end){
        while(start<=end) {
            //finding middle element
//            int mid = (start+end)/2; -> there is possiblity that (start+end) exceeds the range of int
            int mid = start + (end - start) / 2;
            //cheking on left side
            if (target < arr[mid]) {
                end = mid - 1;
            }
            //checking on right side
            else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid; //answer
            }
        }
        return -1;
    }
}
