//Add minimum number of rungs
//TC:O(n), SC:O(1)
/*Input: rungs = [1,3,5,10], dist = 2
Output: 2
Explanation:
You currently cannot reach the last rung.
Add rungs at heights 7 and 8 to climb this ladder. 
The ladder will now have rungs at [1,3,5,7,8,10].*/
class Solution {
    public int addRungs(int[] rungs, int dist) {
        int result = (rungs[0] - 1)/dist;
        for(int i=1;i<rungs.length;i++) {
            result += (rungs[i]-rungs[i-1]-1)/dist;
        }
        return result;
    }
}