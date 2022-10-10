class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int m=0;
        int n=nums.length;
        
        for(int i:map.keySet()){
            if(map.get(i)>n/2){
                m=i;
            }
        }
        return m;
    }
}
