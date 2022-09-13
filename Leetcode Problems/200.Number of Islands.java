class Solution {
    
    public static void dfs(int len,int colsize,char grid[][],int row,int col){
        
        if(row<0 || row>=len || col<0 || col>=colsize){
            return;
        }
        
        if(grid[row][col]=='1'){
            grid[row][col]='2';
            
            dfs(len,colsize,grid,row+1,col);
            dfs(len,colsize,grid,row-1,col);
            dfs(len,colsize,grid,row,col+1);
            dfs(len,colsize,grid,row,col-1);
        }
    }
    public int numIslands(char[][] grid) {
        
        int len=grid.length;
        int colsize=grid[0].length;
        int count=0;
        
        for(int i=0;i<len;i++){
            for(int j=0;j<colsize;j++){
                if(grid[i][j]=='1'){
                    count++;
                    
                    dfs(len,colsize,grid,i,j);
                }
            }
        }
        return count;
    }
}
