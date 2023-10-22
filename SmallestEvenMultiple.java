//Smallest Even Multiple
//TC:O(1), SC:O(1)
//Input:6
//Output:6
class Solution {
    public int smallestEvenMultiple(int n) {
         return (n%2==0)?n:n*2;
    }
}