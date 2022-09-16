class Solution {
    public int mySqrt(int x) {
        
        long max=0;
        
        for(long i=1;i*i<=x;i++){
            long curr=i*i;
            
            if(curr>x) break;
            if(curr==x){
                return (int)i;
            }
            if(curr>max && curr<=x){
                max=i;
            }
        }
        return (int)max;
    }
}
