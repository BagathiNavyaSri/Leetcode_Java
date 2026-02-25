class MedianFinder {

    Queue<Integer> leftmaxq;
    Queue<Integer> rightminq;

    public MedianFinder() {
        leftmaxq = new PriorityQueue<>((a, b) -> b - a); //by default it generates minheap.. as we need max heap we are writing comparator(i.e) writing lambda function
        rightminq = new PriorityQueue<>((a, b) -> a - b);
    }
    
    public void addNum(int num) {
        leftmaxq.add(num);
        rightminq.add(leftmaxq.poll());
        if(leftmaxq.size() < rightminq.size()){
            leftmaxq.add(rightminq.poll());
        }
    }
    
    public double findMedian() {
        if(leftmaxq.size() > rightminq.size()){
            return leftmaxq.peek();
        }
        return (leftmaxq.peek() + rightminq.peek())/2.0;
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */
