class Solution {
    public int[] findOrder(int n, int[][] pre) {
        
        int len=pre.length;

        int[] degree=new int[n];
        ArrayList<Integer>[] adj=new ArrayList[n];
        Queue<Integer> bfs=new LinkedList<>();
        int[] node=new int[n];

        for(int i=0;i<n;i++){
            adj[i]=new ArrayList<Integer>();
        }
        for(int[] arr:pre){
            adj[arr[1]].add(arr[0]);
            degree[arr[0]]++;
        }

        for(int i=0;i<n;i++){
            if(degree[i]==0){
                bfs.offer(i);
            }
        }
        int i=0;
        while(!bfs.isEmpty()){
            
            node[i++]=bfs.peek();

            for(int j:adj[bfs.poll()]){

                if(--degree[j]==0){
                    bfs.offer(j);
                }
            }
        }

         if (i == n) {
           return node;
        }

        return new int[0];
    }
}
