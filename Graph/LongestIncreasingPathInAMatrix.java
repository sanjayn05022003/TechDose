class Solution {

    public int dfs(int i, int j, int[][] mat, int r, int c, int[][] cache){

        if(i>=r || j>=c || i<0 || j<0){
            return 0;
        }
        if(cache[i][j]>0){
            return cache[i][j];
        }
        int currmax=1;

        if(j+1<c && j+1>=0 && Integer.compare(mat[i][j],mat[i][j+1])<0){
            currmax=Math.max(currmax, 1+ dfs(i, j+1, mat, r, c, cache));
        }
        
        if(i+1<r && i+1>=0 && Integer.compare(mat[i][j],mat[i+1][j])<0){
            currmax=Math.max(currmax, 1+ dfs(i+1, j, mat, r, c, cache));
        }

        if(j-1>=0 && j-1<c && Integer.compare(mat[i][j],mat[i][j-1])<0){
            currmax=Math.max(currmax, 1+ dfs(i, j-1, mat, r, c, cache));
            
        }

        if(i-1>=0 && i-1<r && Integer.compare(mat[i][j],mat[i-1][j])<0){
            currmax=Math.max(currmax, 1+ dfs(i-1, j, mat, r, c, cache));
            
        }

        cache[i][j]=currmax;
        return currmax;
    }
    public int longestIncreasingPath(int[][] mat) {
        
        
        int max=0;

        int[][] cache=new int[mat.length][mat[0].length];

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){

                max=Math.max(max, dfs(i, j, mat, mat.length, mat[0].length, cache));
            }
        }

        return max;

    }
}
