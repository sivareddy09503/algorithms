//find-the-k-beauty-of-a-number
//TC::O(n), SC:O(1)
/*Input: num = 240, k = 2
Output: 2
Explanation: The following are the substrings of num of length k:
- "24" from "240": 24 is a divisor of 240.
- "40" from "240": 40 is a divisor of 240.
Therefore, the k-beauty is 2.*/
class Solution {
    public int divisorSubstrings(int num, int k) {
        String str = String.valueOf(num);
        int count = 0;
        for(int i=0;i<str.length()-k+1;i++) {
            String temp = str.substring(i,i+k);
            int n1 = Integer.valueOf(temp);
            if(n1==0) {
                continue;
            }
            if(num%n1==0) {
                count++;
            }
        }
        return count;
    }
}