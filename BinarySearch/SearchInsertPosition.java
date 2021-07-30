//Search Insert Position using Binary Search..

class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int n = nums.length;
        int r = n-1;
        int mid =0;
        while(r>=l){
            mid = l+(r-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            if(nums[mid]>target){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
            
        }
        return l;
    }
}
