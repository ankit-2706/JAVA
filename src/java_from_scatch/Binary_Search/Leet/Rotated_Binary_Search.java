package java_from_scatch.Binary_Search.Leet;
// https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/

//APPROACH

//         1) find pivot
//         2) Search in the first half, simple binary search--> (0,pivot)
//         3) otherwise search on the second half , binary search ( pivot+1,end)

/*
case 1:
If mid>mid+1 element --> i.e, Pivot

case 2:
If mid<mid-1 element --> ans = mid-1

case 3:
If Start element > mid element --> end = mid-1
in this case,all elements from mid will be < start
hence we can ignore all these elements

case 4:
If Start element < mid element --> start = mid=1
if this way oivot it wiuld have caught and returnedin case 2
hence proved ,bigger ele lie ahead ,therefore ignore element below mid

*/

/*
case 1 :
pivot element = target --> ans
case 2:
target > start element
search space = ( start,p-1)
case 3:
target < start element
i.e, we lnow that all elements from start,pivot are going to be bigger than target
*/

public class Rotated_Binary_Search {
    public static void main(String[] args) {
        int arr[] = { 4,5,6,7,0,1,2 };
        int target = 6;
        System.out.println( search( arr,target));
//        System.out.println(find_pivot(arr));
    }

    public static  int search(int[] arr, int target) {
        int pivot = find_pivot(arr);

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
    static int find_pivot( int []arr ){
        int start = 0;
        int end = arr.length-1;
        while( start<=end ){
            //find mid
            int mid = start + (end-start)/2;
            //Write all 4 cases here
            if( mid < end && arr[mid] > arr[mid+1] ){
                return mid;
            }
            if( mid > start && arr[mid] < arr[mid-1] ){
                return mid-1;
            }
            if( arr[mid] < arr[start] ){
                end = mid-1;
            }
            if( arr[mid] > arr[start] ){
                start = mid+1;
            }
        }
        return -1;
    }
}



//
//    static int search(int[] nums, int target) {
//        int pivot = findPivot(nums);
//
//        // if you did not find a pivot, it means the array is not rotated
//        if (pivot == -1) {
//            // just do normal binary search
//            return binarySearch(nums, target, 0 , nums.length - 1);
//        }
//
//        // if pivot is found, you have found 2 asc sorted arrays
//        if (nums[pivot] == target) {
//            return pivot;
//        }
//
//        if (target >= nums[0]) {
//            return binarySearch(nums, target, 0, pivot - 1);
//        }
//
//        return binarySearch(nums, target, pivot + 1, nums.length - 1);
//    }
//
//    static int binarySearch(int[] arr, int target, int start, int end) {
//        while(start <= end) {
//            // find the middle element
////            int mid = (start + end) / 2; // might be possible that (start + end) exceeds the range of int in java
//            int mid = start + (end - start) / 2;
//
//            if (target < arr[mid]) {
//                end = mid - 1;
//            } else if (target > arr[mid]) {
//                start = mid + 1;
//            } else {
//                // ans found
//                return mid;
//            }
//        }
//        return -1;
//    }
//
//    // this will not work in duplicate values
//    static int findPivot(int[] arr) {
//        int start = 0;
//        int end = arr.length - 1;
//        while (start <= end) {
//            int mid = start + (end - start) / 2;
//            // 4 cases over here
//            if (mid < end && arr[mid] > arr[mid + 1]) {
//                return mid;
//            }
//            if (mid > start && arr[mid] < arr[mid - 1]) {
//                return mid-1;
//            }
//            if (arr[mid] <= arr[start]) {
//                end = mid - 1;
//            } else {
//                start = mid + 1;
//            }
//        }
//        return -1;
//    }