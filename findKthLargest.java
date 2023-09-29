//Kth Largest Element in an Array
//TC:O(k+(n-k)*logk); SC: O(n)
//Input: nums = [3,2,1,5,6,4], k = 2
//Output: 5
class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        for(int i=0; i<k; i++) {
            minHeap.add(nums[i]);
        }
        for(int i=k; i<nums.length; i++) {
            if(nums[i]>minHeap.peek()) {
                minHeap.poll();
                minHeap.add(nums[i]);
            }
        }
        return minHeap.peek();
    }
}