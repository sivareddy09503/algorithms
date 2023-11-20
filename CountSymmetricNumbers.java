//Count Symmetric Integers
//TC:O(n^2), SC:O(1)
//Input: low = 1200, high = 1230
//Output: 4
//Explanation: There are 4 symmetric integers between 1200 and 1230: 1203, 1212, 1221, and 1230.
class Solution {
    public int countSymmetricIntegers(int low, int high) {
        //if(low<11) return 0;
        int count = 0;
        for(int i=low;i<=high;i++) {
            String s = Integer.toString(i);
            int t=0, n=s.length();
            for(int j=0;j<n/2;j++) {
                t +=s.charAt(j) - s.charAt(n-j-1);
            }
            if(n%2==0 && t==0) count++;
        }
        return count;
    }
}