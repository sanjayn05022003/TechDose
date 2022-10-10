class Solution {
    public int[][] generateMatrix(int n) {
        
        int[][]mat=new int[n][n];
        
        int top=0,bottom=n-1,right=n-1,left=0;
        int flag=0,val=1;
        
        while(top<=bottom && left<=right){
            
            if(flag==0){
                for(int i=left;i<=right;i++){
                    mat[top][i]=val;
                    val++;
                }
                top++;
            }
            else if(flag==1){
                for(int i=top;i<=bottom;i++){
                    mat[i][right]=val;
                    val++;
                }
                right--;
            }
            else if(flag==2){
                for(int i=right;i>=left;i--){
                    mat[bottom][i]=val;
                    val++;
                }
                bottom--;
            }
            else if(flag==3){
                for(int i=bottom;i>=top;i--){
                    mat[i][left]=val;
                    val++;
                }
                left++;
            }
            flag=(flag+1)%4;
        
        }
        
        return mat;
    }
}
