//maximize-sum-of-array-after-k-negations
//TC:O(n), SC:O(n)
/*Input: nums = [4,2,3], k = 1
Output: 5
Explanation: Choose index 1 and nums becomes [4,-2,3].*/
class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int p:nums) {
            pq.offer(p);
        }
        while(k-->0) {
            int temp = pq.poll();
            temp = -temp;
            pq.offer(temp);
        }
        int sum = 0;
        while(!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }
}