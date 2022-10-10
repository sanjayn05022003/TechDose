class Solution {
    public int removeDuplicates(int[] nums) {
        int len=nums.length;
        
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int ind=0;
        int k=map.size();
        
        for(int i=0;i<len;i++){
            if(map.get(nums[i])>0){
                nums[ind++]=nums[i];
                map.put(nums[i],0);
            }
        }
        
        return k;
    }
}
