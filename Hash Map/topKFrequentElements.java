class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        int len=nums.length;

        Map<Integer,Integer>map=new HashMap<Integer,Integer>();

        for(int i=0;i<len;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }

        int[] arr=new int[map.size()];
        int[] index=new int[map.size()];

        int size=map.size();
        int a=0,b=0;

        for(int i:map.keySet()){
            arr[a++]=i;
        }
        for(int i:map.keySet()){
            index[b++]=map.get(i);
        }

        for(int i=0;i<a;i++){
            for(int j=i+1;j<a;j++){

                if(index[i]<index[j]){
                    int t=index[i];
                    index[i]=index[j];
                    index[j]=t;

                    int r=arr[i];
                    arr[i]=arr[j];
                    arr[j]=r;
                }
            }
        }

        int[] res=new int[k];

        int ctr=0;
        for(int i=0;i<k;i++){
            
            res[ctr++]=arr[i];
        }
        return res;
    }
}
