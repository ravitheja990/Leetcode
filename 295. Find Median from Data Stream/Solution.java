class MedianFinder {
    
    private Queue<Integer> minHeap = null;
    private Queue<Integer> maxHeap = null;
    
    public MedianFinder() {
        minHeap = new PriorityQueue<Integer>((a,b)->(a-b));
        maxHeap = new PriorityQueue<Integer>((a,b)->(b-a));
    }
    
    public void addNum(int num) {
        if(maxHeap.size() == 0 || maxHeap.peek() >= num) {
            maxHeap.add(num);
        }else {
            minHeap.add(num);
        }
        reBalanceHeaps();
    }
    
    private void reBalanceHeaps() {
        if(maxHeap.size() - minHeap.size() > 1) {
            minHeap.add(maxHeap.remove());
        }else if(minHeap.size() - maxHeap.size() > 1) {
            maxHeap.add(minHeap.remove());
        }
    }
    
    public double findMedian() {
        if(maxHeap.size() == minHeap.size()) {
            return (double) (maxHeap.peek()+minHeap.peek())/2;
        }else if(maxHeap.size() > minHeap.size()) {
            return maxHeap.peek();
        }else {
            return minHeap.peek();
        }
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
