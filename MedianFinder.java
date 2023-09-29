//Find Median from Data stream
//TC:(logn), SC:(1)
//Input ["MedianFinder", "addNum", "addNum", "findMedian", "addNum", "findMedian"]
//[[], [1], [2], [], [3], []]
//Output [null, null, null, 1.5, null, 2.0]
class MedianFinder {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    public MedianFinder() {
        minHeap = new PriorityQueue<Integer>((a,b) -> a-b);
        maxHeap = new PriorityQueue<Integer>((a,b) -> b-a);
    }
    
    public void addNum(int num) {
        minHeap.add(num);
        maxHeap.add(minHeap.poll());
        if(minHeap.size()<maxHeap.size()) {
            minHeap.add(maxHeap.poll());
        }
    }
    
    public double findMedian() {
        if(minHeap.size() == maxHeap.size())
            return (minHeap.peek()+maxHeap.peek())/2.0;
        return minHeap.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */