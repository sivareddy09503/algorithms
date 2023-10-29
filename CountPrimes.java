//Count Primes
//TC:O(n^2), SC:O(n)
//Input: n = 10
//Output: 4
class Solution {
    public int countPrimes(int n) {
        if(n==0 || n==1) return 0;
        int count = 0;
        Boolean[] isPrime = new Boolean[n+1];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2;i*i<=n;i++) {
            for(int j=i*2;j<=n;j=j+i) {
                isPrime[j] = false;
            }
        }
        for(int i=0;i<n;i++){
            if(isPrime[i]==true) count++;
        }
        return count;
    }
}