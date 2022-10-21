class Solution {
    public int maximumSum(int[] nums) {
        
        int len=nums.length;
        Map<Integer,Integer>map=new HashMap<>();

        int returnmax=-1;

        for(int i=0;i<len;i++){
            int digsum=0;
            int temp=nums[i];

            while(temp>0){
                digsum+=(temp%10);
                temp/=10;
            }

            if(map.containsKey(digsum)){
                if(map.get(digsum)+nums[i]>returnmax){
                    returnmax=map.get(digsum)+nums[i];
                }
                 if(nums[i]>map.get(digsum)){
                    map.put(digsum,nums[i]);
                }
            }
            else{
                map.put(digsum,nums[i]);
            }
        }
        System.out.print(map);
        return returnmax;
    }
}
