//Most visited sector in a circular track
//TC:O(n), SC:O(n)
/*Input: n = 4, rounds = [1,3,1,2]
Output: [1,2]
Explanation: The marathon starts at sector 1. The order of the visited sectors is as follows:
1 --> 2 --> 3 (end of round 1) --> 4 --> 1 (end of round 2) --> 2 (end of round 3 and the marathon)
We can see that both sectors 1 and 2 are visited twice and they are the most visited sectors. Sectors 3 and 4 are visited only once.*/
class Solution {
    public List<Integer> mostVisited(int n, int[] rounds) {
        int start = rounds[0];
        int end = rounds[rounds.length-1];
        List<Integer> res = new ArrayList<>();
        if(start<=end) {
            for(int i=start;i<=end;i++) res.add(i);
        } else {
            for(int i=1;i<=end;i++) res.add(i);
            for(int i=start;i<=n;i++) res.add(i);
        }
        return res;
    }
}