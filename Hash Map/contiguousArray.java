class Solution {
    public int findMaxLength(int[] nums) {
        
        Map<Integer,Integer>map=new HashMap<>();
        int len=nums.length;

        int bal=0;
        int max=0;
        
        map.put(0,-1);

        for(int i=0;i<len;i++){

            if(nums[i]==0){
                bal--;
            }
            else{
                bal++;
            }

            if(!map.containsKey(bal)){
                map.put(bal,i);
            }
            else{
                max=Math.max(max,i-map.get(bal));
            }
        }

        return max;
    }
}
