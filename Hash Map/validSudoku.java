class Solution {
    public boolean isValidSudoku(char[][] grid) {
        
        int row=grid.length;
        int col=grid[0].length;

        for(int x=0;x<row;x++){
            for(int y=0;y<col;y++){
                
                System.out.print(grid[x][y]+" ");
            }
            System.out.println();
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){

                for(int x=0;x<row;x++){
                    if(grid[x][j]!='.' && x!=i && grid[x][j]==grid[i][j]){
                        return false;
                    }
                }
                for(int x=0;x<col;x++){
                    if(grid[i][x]!='.' && x!=j && grid[i][x]==grid[i][j]){
                        return false;
                    }
                }
            }
        }

        int i=0,j=0;

        while(i<row){
            while(j<col){

                Map<Character,Integer>map=new HashMap<Character,Integer>();

                for(int x=i;x<i+3;x++){
                    for(int y=j;y<j+3;y++){
                        if(grid[x][y]!='.'){
                            map.put(grid[x][y],map.getOrDefault(grid[x][y],0)+1);
                        }
                    }
                }

                for(char q:map.keySet()){
                    if(map.containsKey(q) && map.get(q)>1){
                        return false;
                    }
                }

                j+=3;
            }
            j=0;
            i+=3;
        }


        return true;
    }
}
