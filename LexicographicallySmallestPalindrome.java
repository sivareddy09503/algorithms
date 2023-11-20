//Lexicographically smallest string
//TC:O(n), SC:O(1)
/*Input: s = "egcfe"
Output: "efcfe"
Explanation: The minimum number of operations to make "egcfe" a palindrome is 1, and the lexicographically smallest palindrome string we can get by modifying one character is "efcfe", by changing 'g'.*/
class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while(i<j) {
            if(arr[i]<arr[j]) {
                arr[j--] = arr[i++];
            } else {
                arr[i++] = arr[j--];
            }
        }
        return new String(arr);
    }
}