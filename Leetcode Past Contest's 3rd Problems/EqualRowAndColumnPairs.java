class Solution {
    public int equalPairs(int[][] grid) {
        
        int r=grid.length;

        List<List<Integer>> list1=new ArrayList<>();

        for(int i=0;i<r;i++){
            List<Integer>curr=new ArrayList<>();

            for(int j=0;j<r;j++){
                curr.add(grid[i][j]);
            }
            list1.add(curr);
        }

        List<List<Integer>> list2=new ArrayList<>();

        for(int j=0;j<r;j++){
            List<Integer>curr=new ArrayList<>();

            for(int i=0;i<r;i++){
                curr.add(grid[i][j]);
            }
            list2.add(curr);
        }

        System.out.print(list1);
        System.out.print(list2);

        int ctr=0;

        for(int i=0;i<list1.size();i++){
            for(int j=0;j<list2.size();j++){
                if(list1.get(i).equals(list2.get(j))){
                    ctr++;
                }
            }
        }

        return ctr;

    }
}
