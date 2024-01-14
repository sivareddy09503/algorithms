//Fair Candy Swap
//TC:O(n), SC:O(n)
/*Input: aliceSizes = [1,1], bobSizes = [2,2]
Output: [1,2]*/
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceTotal = 0, bobTotal = 0;
        for(int candies:aliceSizes) aliceTotal += candies;
        for(int candies:bobSizes) bobTotal += candies;

        Set<Integer> targets = new HashSet<>();
        for(int i=0;i<aliceSizes.length;i++) {
            targets.add((bobTotal - aliceTotal + 2*aliceSizes[i])/2);
        }
        for(int i=0;i<bobSizes.length;i++) {
            if(targets.contains(bobSizes[i])) {
                return new int[] {(aliceTotal+2*bobSizes[i]-bobTotal)/2,bobSizes[i]};
            }
        }
        return new int[0];
    }
}