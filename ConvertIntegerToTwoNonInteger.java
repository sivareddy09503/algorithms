//Convert integer to sum of two no zero integers
//TC:O(n),SC:O(1)
//Input: n = 2
//Output: [1,1]
class Solution {
    public int[] getNoZeroIntegers(int n) {
        int i;
        for(int j=1;j<n;j++) {
            i = n-j;
            if(!(i+"").contains("0") && !(j+"").contains("0")) {
                return new int[]{i,j};
            }
        }
        return new int[]{};
    }
}