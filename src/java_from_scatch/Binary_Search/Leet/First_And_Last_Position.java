package java_from_scatch.Binary_Search.Leet;
public class First_And_Last_Position {

    public static void main(String[] args) {
        int[] nums = {1,1,7,7,7,7,7,4,5};
        int target = 7;
        int[] final_Ans = searchRange(nums,target);
        System.out.println(final_Ans);

    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,-1};
        //check for first occurance if target first
        ans[0] = search(nums,target,true);
        if( ans[0]!=-1){
            ans[1] = search(nums, target, false);
        }
        return ans;
    }
    //this function returns the index value of the target element
     static int search( int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            //finding middle element
//            int mid = (start+end)/2; -> there is possiblity that (start+end) exceeds the range of int
            int mid = start+(end-start)/2;
            //cheking on left side
            if( target<nums[mid] ){
                end = mid-1;
            }
            //checking on right side
            else if( target>nums[mid] ){
                start=mid+1;
            }
            else {
                //potential ans
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}
