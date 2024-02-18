//find-the-town-judge
//TC:O(n), SC:O(n)
/*Input: n = 2, trust = [[1,2]]
Output: 2*/
class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] in = new int[n+1];
        int[] out = new int[n+1];
        for(int i=0;i<trust.length;i++) {
            out[trust[i][0]]=+1;
            in[trust[i][1]] +=1;
        } 
        for(int i=1;i<=n;i++) {
            if(in[i]==n-1 && out[i]==0) {
                return i;
            }
        }
        return -1;
    }
}