//Count Square sum triples
//TC:O(n^3), SC:O(1)
//Input: n = 5
//Output: 2
//Explanation: The square triples are (3,4,5) and (4,3,5).
class Solution {
    public int countTriples(int n) {
        int count = 0;
        for(int i=1;i<n;i++) {
           for(int j=1;j<n;j++) {
               for(int k=1;k<=n;k++) {
                   if(i*i+j*j==k*k) count++;
               }
           }
        }
        return count;
    }
}