class FactorialTrailingZeroes{
    //Factorial Trailing Zeroes
    //TC:O(logn), SC:O(1)
    public int trailingZeroes(int n) {
        int count = 0;
        for(int i=5; i<=n;i=i*5) {
            count = count + n/i;
        }
        return count;
    }
}