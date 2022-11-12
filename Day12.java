class MedianFinder {
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    public void addNum(int num) {
        if (maxHeap.isEmpty() || maxHeap.peek()>=num) maxHeap.add(num);
        else minHeap.add(num);
        if (maxHeap.size()>minHeap.size()+1) minHeap.add(maxHeap.poll());
        else if (minHeap.size()>maxHeap.size()) maxHeap.add(minHeap.poll());
    }
    
    public double findMedian() {
        if (minHeap.size()==maxHeap.size()) return (minHeap.peek()+maxHeap.peek())/2.0;
        return (double)maxHeap.peek();
        
    }
}
