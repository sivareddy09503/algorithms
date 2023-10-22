//Subtract the product and sum of digits of an Integer
//TC:O(n), SC:O(1)
//Input: n = 234
//Output: 15 
class Solution {
    public int subtractProductAndSum(int n) {
        int sum = 0, product =1;
        while(n>0){
            int rem = n%10;
            product *=rem;
            sum +=rem;
            n = n/10;
        }
        return product - sum;
    }
}