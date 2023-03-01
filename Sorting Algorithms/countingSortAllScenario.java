class Solution {
    public int[] sortArray(int[] nums) {
        
        int len=nums.length;
        int maxNum=Integer.MIN_VALUE, minNum=Integer.MAX_VALUE;

        for(int i:nums){
            maxNum=Math.max(maxNum, i);
            minNum=Math.min(minNum, i);
        }

        int[] freq=new int[maxNum-minNum+1];
        for(int i:nums){
            freq[i-minNum]++;
        }

        for(int i=1;i<maxNum-minNum+1;i++){
            freq[i]=freq[i]+freq[i-1];
        }

        int[] res=new int[len];

        for(int i:nums){
            res[freq[i-minNum]-1]=i;
            freq[i-minNum]--;
        }

        return res;

    }
}
//Apt for both positive and negative numbers
