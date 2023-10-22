//Container with most water
//TC:O(n), SCC:O(1)
//Input: height = [1,8,6,2,5,4,8,3,7]
//Output: 49
class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left<right) {
            int currArea = Math.min(height[left],height[right]) * (right-left);
            maxArea = Math.max(maxArea, currArea);
            if(height[left]<height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }
}