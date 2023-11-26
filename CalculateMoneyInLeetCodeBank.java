//Calculate money in leetcode bank
//TC:O(n), SC:O(1)
/*Input: n = 10
Output: 37
Explanation: After the 10th day, the total is (1 + 2 + 3 + 4 + 5 + 6 + 7) + (2 + 3 + 4) = 37. Notice that on the 2nd Monday, Hercy only puts in $2.*/
class Solution {
    public int totalMoney(int n) {
        int count = 1;
        int sum = 0;
        int temp_count =2;
        for(int i=1;i<=n;i++) {
            sum += count;
            count++;
            if(i%7==0) {
                count = temp_count;
                temp_count++;
            }
        }
        return sum;
    }
}