class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        
        Map<Integer,List<Integer>>map=new HashMap<>();

        for(int[] arr:edges){
            int a=arr[0];
            int b=arr[1];

            map.computeIfAbsent(a,val-> new ArrayList<Integer>()).add(b);
            map.computeIfAbsent(b,val-> new ArrayList<Integer>()).add(a);
        }

        int[] visit=new int[n];

        Queue<Integer>q=new LinkedList<>();
        q.offer(source);
        visit[source]=1;

        while(!q.isEmpty()){
            

            int curr=q.poll();
            if(curr==destination){
                return true;
            }

            for(int temp:map.get(curr)){
                if(visit[temp]==0){
                    visit[temp]=1;
                    
                    q.offer(temp);
                }
            }
        }
        return false;
    }
}
