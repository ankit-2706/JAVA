package java_from_scatch.Binary_Search.Leet;
// https://leetcode.com/problems/find-in-mountain-array/
//Given arr = {2,3,5,6,8,7,4,1} & Target = 6
//Answer = 3 since 3 is the index of target 6

//APPROACH
// There are basically 3 steps involved-->
// 1) Find the Peak element in the array--( here 8 )
// 2) Apply Binary search in asc aray--( 2---8 )
// 3) If element not found,Apply Binary search in dec array

public class SearchMountainArray {
    public static void main(String[] args) {
        int  arr[] = {2,5,7,9,8,6,3,1};
        int target = 7;
        int ans = SearchInMountainArray(arr,target);
        System.out.println(ans);

    }
     static int SearchInMountainArray(int arr[], int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = Agnostic_BS(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        } else {
            //try to search in the other half
            return Agnostic_BS(arr, target, peak + 1, arr.length - 1);
        }
    }
    static int peakIndexInMountainArray(int arr[]) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                //u are in decending part of array
                //this may be the answer, but look  at left
                //this is why end!=mid-1;
                end = mid;
            }
            else {
                //u are in acending part of array
                start = mid + 1; //we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        // start and end are always trying to find max element in the above 2 checks
        // hence, when they are pointing to just one element, that is the max one because that is what the checks say
        // more elaboration: at every point of time for start and end, they have the best possible answer till that time
        // and if we are saying that only one item is remaining, hence cuz of above line that is the best possible ans

        return start; //or return end as both are = ,for getting index of peak element
        //for getting peak element-> return  arr[start]
    }

    static int Agnostic_BS(int arr[], int target, int start, int end) {

        //find whether array is Sorted or not
        boolean isAsc = arr[start] <= arr[end];

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


