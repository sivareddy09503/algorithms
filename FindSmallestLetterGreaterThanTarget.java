//Find smallest letter greater than target
//TC:O(n), SC:O(1)
/*Input: letters = ["c","f","j"], target = "a"
Output: "c"
Explanation: The smallest character that is lexicographically greater than 'a' in letters is 'c'*/
class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int n = letters.length;
        int left = 0, right = n;
        while(left<right) {
            int mid = left + (right-left)/2;
            if(letters[mid]<=target) {
                left = mid+1;
            } else {
                right = mid;
            }
        }
        if(left>=n) return letters[0];
        return letters[left];
    }
}