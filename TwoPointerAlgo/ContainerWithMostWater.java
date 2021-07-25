class Solution {
    public int maxArea(int[] height) {
        int max=0;
        int start=0; 
        int last=height.length-1;
        while(start<last){
            if(height[start]>=height[last]){
                int p=height[last]*(last-start);
                if(p>max){
                    max=p;
                }
                last--;
            }
            else{
                int p=height[start]*(last-start);
                if(p>max){
                    max=p;
                    
                }
                start++;
            }
        }
        return max;
    }
}
