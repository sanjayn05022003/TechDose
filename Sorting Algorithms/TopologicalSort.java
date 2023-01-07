class Solution {
    public boolean canFinish(int numCourses, int[][] pre) {
        
        int len=pre.length;

        int[] degree=new int[numCourses];
        List<Integer> bfs=new ArrayList<>();
        ArrayList<Integer> [] adj=new ArrayList[numCourses];

        for(int i=0;i<numCourses;i++){
            adj[i]=new ArrayList<Integer>();
        }

        for(int[] a:pre){
            adj[a[1]].add(a[0]);
            degree[a[0]]++;
        }

        for(int i=0;i<degree.length;i++){
            if(degree[i]==0){
                bfs.add(i);
            }
        }

        for(int i=0;i<bfs.size();i++){
            for(int j:adj[bfs.get(i)]){

                if(--degree[j]==0){
                    bfs.add(j);
                }
            }
        }

        // for(int i:bfs){
        //     System.out.print(i+" ");
        // }
        return bfs.size()==numCourses;
    }
}


//LEETCODE 207
// 207. Course Schedule

// Companies
// There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1. You are given an array prerequisites where prerequisites[i] = [ai, bi] indicates that you must take course bi first if you want to take course ai.

// For example, the pair [0, 1], indicates that to take course 0 you have to first take course 1.
// Return true if you can finish all courses. Otherwise, return false.
