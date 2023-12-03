//Count distinct numbers on board
//TC:O(1), SC:O(1)
//Input: n = 5
//Output: 4
/*Explanation: Initially, 5 is present on the board. 
The next day, 2 and 4 will be added since 5 % 2 == 1 and 5 % 4 == 1. 
After that day, 3 will be added to the board because 4 % 3 == 1. 
At the end of a billion days, the distinct numbers on the board will be 2, 3, 4, and 5*/
class Solution {
    public int distinctIntegers(int n) {
        if(n==1) return 1;
        return n-1;
    }
}