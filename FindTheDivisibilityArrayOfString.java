//Find the divisibility array of a string
//TC:O(n), SC:O(1)
/*Input: word = "998244353", m = 3
Output: [1,1,0,0,0,1,1,0,0]
Explanation: There are only 4 prefixes that are divisible by 3: "9", "99", "998244", and "9982443"*/
class Solution {
    public int[] divisibilityArray(String word, int m) {
        int[] result = new int[word.length()];
        long rem = 0;
        for(int i=0;i<word.length();i++) {
            int num = word.charAt(i)-'0';
            rem = (rem*10+num)%m;
            if(rem==0) {
                result[i] = 1;
            }
        }
        return result;
    }
}