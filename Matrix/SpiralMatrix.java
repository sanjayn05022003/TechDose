class Solution {
    public List<Integer> spiralOrder(int[][] mat) {
        
        int row=mat.length;
        int col=mat[0].length;
        
        int top=0,bottom=row-1,left=0,right=col-1;
        List<Integer>lst=new ArrayList<Integer>();
        
        int flag=0;
        
        while(top<=bottom && left<=right){
            
            if(flag==0){
                for(int j=left;j<=right;j++){
                    lst.add(mat[top][j]);
                }
                top++;
            }
            else if(flag==1){
                for(int i=top;i<=bottom;i++){
                    lst.add(mat[i][right]);
                }
                right--;
            }
            else if(flag==2){
                for(int j=right;j>=left;j--){
                    lst.add(mat[bottom][j]);
                }
                bottom--;
            }
            else if(flag==3){
                for(int i=bottom;i>=top;i--){
                    lst.add(mat[i][left]);
                }
                left++;
            }
            flag=(flag+1)%4;
        }
        return lst;
    }
}
