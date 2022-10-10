class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        ArrayList<Integer>lst=new ArrayList<Integer>();
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int n=nums.length;
        
        for(int i:map.keySet()){
            if(map.get(i)>n/3){
                lst.add(i);
            }
        }
        return lst;
        
    }
}
