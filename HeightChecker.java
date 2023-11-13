//Height checker
//TC:O(nlogn), SC:O(n)
//Input: heights = [1,1,4,2,1,3]
//Output: 3
class Solution {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] temp = new int[heights.length];
        int n = heights.length;
        for(int i=0;i<n;i++) {
            temp[i] = heights[i];
        }
        Arrays.sort(temp);
        for(int i=0;i<n;i++) {
            if(temp[i]!=heights[i]) count++;
        }
        return count;
    }
}