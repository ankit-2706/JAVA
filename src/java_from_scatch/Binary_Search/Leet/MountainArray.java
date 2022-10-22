package java_from_scatch.Binary_Search.Leet;
// https://leetcode.com/problems/peak-index-in-a-mountain-array
// https://leetcode.com/problems/find-peak-element/

//NOTE: Bitonic array: a array in which first most elements are in increasing order and rightmost elements are in decresing order

//APPROACH
//there are basically 3 conditoins that we should keep in mind
//Conditions: 1) If e[mid]>e[mid+1] => e=mid but check left || you are in descending part of array
//            2) If e[mid]<e[mid+1] ||you are in ascending part of array
//            3) Check when will loop break?

public class MountainArray {
    public static void main(String[] args) {
        int arr[] = {1,2,6,8,9,7,5,4,3};
        int ans = peakIndexInMountainArray(arr);
        System.out.println(ans);
    }
    public static int peakIndexInMountainArray(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {

            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                //u are in decending part of array
                //this may be the answer, but look  at left
                //this is why end!=mid-1;
                end = mid;
            } else {
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
}

