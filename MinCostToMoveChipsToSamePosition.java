///minimum-cost-to-move-chips-to-the-same-position
//TC:O(n), SC:O(1)
/*Input: position = [1,2,3]
Output: 1
Explanation: First step: Move the chip at position 3 to position 1 with cost = 0.
Second step: Move the chip at position 2 to position 1 with cost = 1.
Total cost is 1.*/
class Solution {
    public int minCostToMoveChips(int[] position) {
        int odd = 0;
        for(int i:position) {
            if(i%2!=0) odd++;
        }
        return Math.min(odd,position.length-odd);
    }
}