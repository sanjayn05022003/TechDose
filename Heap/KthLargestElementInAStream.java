class KthLargest {

    int k=0;
    PriorityQueue<Integer>q=new PriorityQueue<Integer>();

    public KthLargest(int k, int[] nums) {

        this.k=k;
        
        for(int i:nums){
            q.add(i);
        }

        while(q.size()>k){
            q.poll();
        }
    }
    
    public int add(int val) {
        q.add(val);
        
        if(q.size()>k){
            q.poll();
        }
        
        return q.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */
