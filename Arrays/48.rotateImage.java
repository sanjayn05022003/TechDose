class Solution {
    public void rotate(int[][] matrix) {
        int r=matrix.length;
        int c=matrix[0].length;

        int[][] mat=new int[r][c];
        int col=0;

        for(int j=0;j<c;j++){
            for(int i=r-1;i>=0;i--){
                mat[j][Math.abs(i-(r-1))]=matrix[i][j];
            }
        }

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                matrix[i][j]=mat[i][j];
            }
        }
    }
}
