//Add digits
//TC:O(n), SC:O(1)
//Input: num = 38
//Output: 2
class Solution {
    int sum = 0;
    public int addDigits(int num) {
        calculateSum(num);
        return sum;
    }
    public void calculateSum(int num) {
        sum = 0;
        while(num>0) {
            int rem = num%10;
            sum += rem;
            num = num/10;
        }
        if(sum>9) { 
         calculateSum(sum);
        }
    }
}