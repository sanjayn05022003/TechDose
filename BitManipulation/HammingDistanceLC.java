class Solution {
    public int hammingDistance(int x, int y) {
      
        int res=(x^y),count=0;
      
        for(int i=0;(res>>i)!=0;i++){
            if(((1<<i)&res)!=0){
                count++;
            }
        }
        return count;
    }
}
