class Solution {
    public long maximumImportance(int n, int[][] roads) {
        
        long[] arr=new long[n];
        int len=roads.length;

        for(int i=0;i<len;i++){
            arr[roads[i][0]]++;
            arr[roads[i][1]]++;
        }

        Arrays.sort(arr);

        long sum=0;
        int ctr=1;

        for(int i=0;i<n;i++){
            sum+=ctr*(arr[i]);
            ctr++;
        }
        return sum;
    }
}
