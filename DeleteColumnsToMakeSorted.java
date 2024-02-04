//Delete columns to make sorted
//TC:O(n^2), SC:O(1)
/*Input: strs = ["cba","daf","ghi"]
Output: 1
Explanation: The grid looks as follows:
  cba
  daf
  ghi
Columns 0 and 2 are sorted, but column 1 is not, so you only need to delete 1 column.*/
class Solution {
    public int minDeletionSize(String[] strs) {
        int strLen = strs[0].length();
        int dels = 0;
        for(int col=0;col<strLen;col++) {
            char prev = '0';
            for(String str:strs) {
                char cur = str.charAt(col);
                if(cur<prev) {
                    dels++;
                    break;
                }
                prev = cur;
            }
        }
        return dels;
    }
}