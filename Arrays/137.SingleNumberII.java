class Solution {
    public int singleNumber(int[] nums) {
        
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(Integer i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        int m=0;
        for(Integer i:map.keySet()){
            if(map.get(i)==1){
                m=i;
            }
        }
        return m;
    }
}
