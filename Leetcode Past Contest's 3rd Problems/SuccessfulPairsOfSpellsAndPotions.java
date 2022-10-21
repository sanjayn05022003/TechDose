class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        int len1=spells.length;
        int len2=potions.length;

        Arrays.sort(potions);
        int[] result=new int[len1];
        
        for(int i=0;i<len1;i++){

            int low=0,high=len2-1;
            int pos=-1;

            while(low<=high){//Binary search
                int mid=low+(high-low)/2;

                if((long)spells[i]*(long)potions[mid]<success){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                    pos=mid;
                }
            }
            
            int diff=len2-pos;
            result[i]=pos==-1?0:diff;
        }

        return result;
    }
}
