class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0 , r = nums.length-1;
        int [] res = new int[2];
        Arrays.fill(res,-1);
        // searching first occurance
        while(r >= l){ 
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                res[0] = mid;
                r = mid -1;
            }
            else if(nums[mid] < target){
                l = mid+1;
            }   
            else{
                r = mid - 1;
            } 
        }
        // searching last occurance
        l = 0;
        r = nums.length-1;
        while(r >= l){ 
            int mid = l + (r-l)/2;
            if(nums[mid] == target){
                res[1] = mid;
                l = mid + 1;
            }
            else if(nums[mid] < target){
                l = mid+1;
            }
            else{
                r = mid - 1;
            } 
        }
        return res;
    }
}
