class Solution {
    public int partitionArray(int[] nums, int k) {
        
        int len=nums.length;
        Arrays.sort(nums);

        int min=nums[0];
        int max=nums[0];
        int ctr=1;

        for(int i:nums){
            min=Math.min(min,i);
            max=Math.max(max,i);
            if(max-min>k){
                min=i;
                max=i;
                ctr++;
            }
        }

        return ctr;
        
    }
}
