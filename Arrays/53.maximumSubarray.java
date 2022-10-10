class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxx=nums[0];
        int currsum=0;
        
        for(int i:nums){
            if(currsum<0){
                currsum=0;
            }
            currsum+=i;
            maxx=Math.max(maxx,currsum);
        }
        return maxx;
    }
}
