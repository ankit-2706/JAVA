package java_from_scatch.Binary_Search.Leet;
//Find the rotation count in rotated sorted array
//give arr = [ 5,7,8,1,3,4 ]   o/p-> 3

public class Rotation_Count {
    public static void main(String[] args) {
        int arr[] = { 4,5,6,7,0,1,2 };   //o/p-> 4
        System.out.println( countRotations(arr));
    }

    private static int countRotations(int[] arr) {
        int pivot = find_pivot(arr);

        //{since index of pivot + 1 gives the number of times array is rotated}
        return pivot + 1;
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
