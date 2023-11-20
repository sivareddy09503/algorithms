//Construct the rectangle
//TC:O(n), SC:O(1)
//Input: area = 4
//Output: [2,2]
class Solution {
    public int[] constructRectangle(int area) {
        int width = (int) Math.sqrt(area);
        while(area%width>0) {
            --width;
        }
        return new int[]{area/width,width};
    }
}