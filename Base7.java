// base 7
//TC:O(n), SC:O(1)
//Input: num = 100
//Output: "202"
class Solution {
    public String convertToBase7(int num) {
        int base = 1;
        int result = 0;
        while(num != 0) {
            int rem = num%7;
            result += rem *base;
            base *= 10;
            num /= 7;
        }
        return Integer.toString(result);
    }
}