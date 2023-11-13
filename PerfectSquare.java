//Valid Perfect Square
//TC:O(logn), SC:O(1)
//Input: num = 16
//Output: true
class Solution {
    public boolean isPerfectSquare(int num) {
        long low=2, high=num;
        if(num==1) return true;
        while(low<high) {
            long mid = low + (high-low)/2;
            if(mid*mid==num) return true;
            else if(mid*mid>num) high = mid;
            else low=mid+1;
        }
        return false;
    }
}