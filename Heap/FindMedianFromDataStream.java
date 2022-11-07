class MedianFinder {

    PriorityQueue<Integer>maxheap=new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer>minheap=new PriorityQueue<>();

    public MedianFinder() {
        
    }
    
    public void addNum(int num) {
        maxheap.offer(num);
        minheap.offer(maxheap.poll());

        if(minheap.size()>maxheap.size()){
            maxheap.offer(minheap.poll());
        }
    }
    
    public double findMedian() {
        
        int m1=maxheap.size();
        int m2=minheap.size();

        if(m1>m2){
            return maxheap.peek();
        }
        else{
            return (double)(maxheap.peek()+minheap.peek())/2;
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
