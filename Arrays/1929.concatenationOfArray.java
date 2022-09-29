class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int len=nums.length;
        int[] arr=new int[len*2];
        
        int fast=len;
        
        for(int i=0;i<len;i++){
            arr[i]=nums[i];
            arr[fast++]=nums[i];
        }
        return arr;
        
    }
}
Footer
© 2022 GitHub, I
