//Time needed to buy tickets
//TC:O(n), SC:O(n)
/*Input: tickets = [2,3,2], k = 2
Output: 6
Explanation: 
- In the first pass, everyone in the line buys a ticket and the line becomes [1, 2, 1].
- In the second pass, everyone in the line buys a ticket and the line becomes [0, 1, 0].
The person at position 2 has successfully bought 2 tickets and it took 3 + 3 = 6 seconds.*/
class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q = new LinkedList<>();
        for(int i=0; i<tickets.length;i++) {
            q.add(i);
        }
        int count = 0;
        while(!q.isEmpty()) {
            count++;
            int front = q.poll();
            if(tickets[front]>=1) {
                tickets[front]-=1;
            }
            if(k==front && tickets[front]==0) {
                break;
            }
            if(k!=front && tickets[front]==0) {
                continue;
            }
            q.add(front);
        }
        return count;
    }
}