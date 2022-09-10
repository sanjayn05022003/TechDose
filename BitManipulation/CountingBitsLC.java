class Solution {
    public int[] countBits(int n) {
        
        int[] arr=new int[n+1];
        
        for(int i=0;i<=n;i++){    
            
            int count=0;
            for(int j=0;(n>>j)!=0;j++){
                if(((1<<j)&i)!=0){
                    count++;
                }
            }
            arr[i]=count;
        }
        return arr;
    }
}
