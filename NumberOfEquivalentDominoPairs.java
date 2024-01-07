//Number of equivalent domino pairs
//TC:O(n), SC:O(1)
//Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
//Output: 1
class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] counts = new int[100];
        int res =0;
        for(int[] d:dominoes) {
            int up = d[0]<d[1] ?d[0]:d[1];
            int down = d[0]<d[1] ?d[1]:d[0];
            res += counts[up*10+down]++;
        }
        return res;
    }
}