class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        for(int i:nums){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        int ret=0;
        for(int i:nums){
            if(map.get(i)==1){
                ret= i;
            }
        }
        return ret;
    }
}
