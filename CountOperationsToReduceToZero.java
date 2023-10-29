//Count Operations to Zero
//TC:O(n), SC:O(1)
//Input: num1 = 2, num2 = 3
//Output: 3
//Return the number of operations required to make either num1 = 0 or num2 = 0
class Solution {
    public int countOperations(int num1, int num2) {
        if(num1==0 || num2==0) return 0;
        int result= 1;
        while(num1!=num2){
            result++;
            if(num1>=num2) {
                num1 = num1 - num2;
            } else {
                num2 = num2-num1;
            }
        }
        return result;
    }
}