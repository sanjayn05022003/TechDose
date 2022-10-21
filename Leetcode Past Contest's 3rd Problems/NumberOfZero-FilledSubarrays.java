class Solution {
    public long zeroFilledSubarray(int[] nums) {
        
        long window=0, ans=0;

        for(int i:nums){
            if(i==0){
                window++;
            }
            else{
                window=0;
            }
            ans+=window;
        }
        return ans;
    }
}
