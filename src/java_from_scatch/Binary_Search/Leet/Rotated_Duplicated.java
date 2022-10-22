package java_from_scatch.Binary_Search.Leet;
//Find the target number in Rotated sorted array having duplicates

public class Rotated_Duplicated {
    public static void main(String[] args) {
        int arr[] = { 4,4,4,5,6,7,0,1,2 };
        int target =4 ;
        System.out.println( search( arr,target));

    }
    //Creating function to execute different functions
    public static  int search(int[] arr, int target) {
        int pivot = find_pivot_with_duplicate(arr);

        // if you did not find a pivot, it means the array is not rotated
        if( pivot == -1 ){
            //just do normal binary search
            return Binary_Search( arr,target,0,arr.length-1);
        }
        //if pivot is found,then you have found 2 ascending arrays
        if( arr[pivot] == target ){
            return pivot;
        }
        if( target > arr[0]){
            return Binary_Search( arr,target,0,pivot-1);
        }
        return Binary_Search( arr,target, pivot+1,arr.length-1);
    }
    //applying Binary Search
    static int Binary_Search(int arr[], int target, int start, int end){
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

     //finding pivot element
    static int find_pivot_with_duplicate(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            //find mid
            int mid = start + (end - start) / 2;
            //Write all 4 cases here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            //if elements at start,mid & end are equal then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                //skip the duplicates
                //NOTE: what if these elements at start and end were pivot?? [first check them if they are pivot or not]
                //check if start is pivot
                if (arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;
                //check if end is pivot
                if (arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            //left side is sorted ,so pivot should be in right
            if (arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
            return -1;

        }
        return -1;
    }
}
