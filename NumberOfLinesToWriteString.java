//Number of lines to write string
//TC:O(n), SC:O(1)
/*Input: widths = [10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10], s = "abcdefghijklmnopqrstuvwxyz"
Output: [3,60]
Explanation: You can write s as follows:
abcdefghij  // 100 pixels wide
klmnopqrst  // 100 pixels wide
uvwxyz      // 60 pixels wide
There are a total of 3 lines, and the last line is 60 pixels wide.*/
class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int count = 1, sum = 0;
        for(char i:s.toCharArray()) {
            if((sum+widths[i-'a'])<=100) sum += widths[i-'a'];
            else {
                sum = widths[i-'a'];
                count++;
            }
        }
        return new int[]{count,sum};
    }
}