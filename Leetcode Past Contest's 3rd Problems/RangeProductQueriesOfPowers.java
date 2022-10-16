class Solution {
    public int[] productQueries(int n, int[][] queries) {
        
        int len=queries.length;

        int[] res=new int[len];
        ArrayList<Long>list=new ArrayList<>();

        String s=Integer.toBinaryString(n);
        int slen=s.length();

        long multi=1;

        for(int i=slen-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                list.add((long)multi);
            }
            multi=(multi*2);
        }

        for(int i=0;i<len;i++){
            int start=queries[i][0];
            int end=queries[i][1];
            
            long prod=1;
            long mod=(long)1e9+7;

            for(int j=start;j<=end;j++){
                prod=(prod*(list.get(j)))%(mod);
            }
            res[i]=(int)prod;
        }
        return res;
    }
}
