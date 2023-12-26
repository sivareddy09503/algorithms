//Perfect Squares
//TC:O(N^2),SC:O(n)
/*Input: n = 12
Output: 3
Explanation: 12 = 4 + 4 + 4*/
class Solution {
    public int numSquares(int n) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> visit = new HashSet<>();
        if(n>0) queue.add(n);
        int count = 0;
        while(!queue.isEmpty()) {
            count++;
            int size = queue.size();
            for(int j=1;j<=size;j++) {
                int value = queue.poll();
                int div = (int)Math.sqrt(value);
                for(int i=1;i<=div;i++) {
                    if(value-(i*i)==0) return count;
                    else if(visit.add(value-(i*i)))
                        queue.add(value-(i*i));
                }
            }
        }
        return count;
    }
}