//Number of rectangles that can form the largest square
//TC:O(n), SC:O(n)
/*Input: rectangles = [[5,8],[3,9],[5,12],[16,5]]
Output: 3
Explanation: The largest squares you can get from each rectangle are of lengths [5,3,5,5].
The largest possible square is of length 5, and you can get it out of 3 rectangles.*/
class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        int[] sides = new int[rectangles.length];
        int count = 0, maxLen = 0;
        for(int i = 0;i<rectangles.length;i++) {
            if(rectangles[i][0]<rectangles[i][1]) {
                sides[i] = rectangles[i][0];
            } else {
                sides[i] = rectangles[i][1];
            }
        }
        for(int num:sides) {
            if(num>maxLen) maxLen = num;
        }
        for(int num:sides) {
            if(num==maxLen) count++;
        }
        return count;
    }
}