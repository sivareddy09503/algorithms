//Valid Palidrome
//TC:O(n), SC:O(1)
/*Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome*/
class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int low = 0, high = s.length()-1;
        while(low<=high) {
            char a = s.charAt(low);
            char b = s.charAt(high);
            if(!Character.isLetterOrDigit(a)) {
                low++;
            } else if(!Character.isLetterOrDigit(b)) {
                high--;
            } else {
                if(Character.toLowerCase(a) != Character.toLowerCase(b)) {
                    return false;
                }
                low++;
                high--;
            }
        }
        return true;
    }
}