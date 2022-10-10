class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        int len=nums.length;

        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        Set<Integer> set=new HashSet<Integer>();

        for(int i=0;i<len;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                map.put(nums[i],i);
            }
            else{
                if(Math.abs(map.get(nums[i])-i)<=k){
                    return true;
                }
                else{
                    map.put(nums[i],i);
                }
            }
        }
       return false;
    }
}
