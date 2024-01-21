//Take gifts from the richest pile
//TC:O(n), SC:O(n)
/*Input: gifts = [25,64,9,4,100], k = 4
Output: 29
Explanation: 
The gifts are taken in the following way:
- In the first second, the last pile is chosen and 10 gifts are left behind.
- Then the second pile is chosen and 8 gifts are left behind.
- After that the first pile is chosen and 5 gifts are left behind.
- Finally, the last pile is chosen again and 3 gifts are left behind.
The final remaining gifts are [5,8,9,4,3], so the total number of gifts remaining is 29.*/
class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
        for(int gift: gifts) {
            pq.add(gift);
        }
        while(k-->0) {
            pq.add((int)Math.floor(Math.sqrt(pq.poll())));
        }
        long sum=0;
        while(!pq.isEmpty()) {
            sum += pq.poll();
        }
        return sum;
    }
}