//Happy Number
//TC:O(n), SC:O(1)
//Input: n = 19
//Output: true
/*Explanation:
1^2 + 9^2 = 82
8^2 + 2^2 = 68
6^2 + 8^2 = 100
1^2 + 0^2 + 0^2 = 1*/
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;
        do {
            slow = square(slow);
            fast = square(square(fast));
        } while(slow!=fast);
        
        
        return slow==1;
    }
    public int square(int n){
        int result = 0;
        while(n>0){
            int rem = n%10;
            result += rem * rem;
            n = n/10;
        }
        return result;
    }
}
