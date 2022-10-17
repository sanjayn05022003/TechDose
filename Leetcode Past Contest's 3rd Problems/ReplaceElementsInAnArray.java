class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        
        int len=nums.length;

        Map<Integer,Integer>map=new HashMap<Integer,Integer>();

        for(int i=0;i<len;i++){
            map.put(nums[i],i);
        }

        for(int[] k:operations){
            int l=k[0];
            int r=k[1];

            int ind=map.get(l);
            nums[ind]=r;
            map.remove(l);
            map.put(r,ind);
        }
        return nums;
    }
}
