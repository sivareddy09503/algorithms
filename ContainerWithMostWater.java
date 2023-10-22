//Find the highest altitude
//TC:O(n), SC:O(n)
//Input: gain = [-5,1,5,0,-7]
//Output: 1
class Solution {
    public int largestAltitude(int[] gain) {
        int[] prefix = new int[gain.length+1];
        prefix[0] = 0;
        int max = 0;
        for(int i=0;i<gain.length;i++) {
            prefix[i+1] = prefix[i]+gain[i];
            max = Math.max(max,prefix[i+1]);
        }
        return max;
    }
}