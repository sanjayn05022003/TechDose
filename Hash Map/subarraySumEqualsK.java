class Solution {
    public int subarraySum(int[] nums, int k) {
        
        int len=nums.length;
        int sum=0;

        int[] sumarr=new int[len+1];

        for(int i=0;i<len;i++){
            sum+=nums[i];
            sumarr[i+1]=sum;
        }
        int res=0;

        for(int i=0;i<=len;i++){

            int prev=sumarr[i];

            for(int j=i+1;j<=len;j++){

                if(sumarr[j]-prev ==k){
                    res++;
                }
            }
        }
        
        
        
        return res;
    }
}
