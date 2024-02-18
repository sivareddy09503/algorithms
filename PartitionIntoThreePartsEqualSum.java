//partition-array-into-three-parts-with-equal-sum
//TC:O(n), SC:O(1)
/*Input: arr = [0,2,1,-6,6,-7,9,1,2,0,1]
Output: true
Explanation: 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1*/
class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum = 0;
        for(int i:arr) {
            sum += i;
        }
        if(sum%3!=0) return false;
        int each = sum/3, temp = 0, found = 0;
        for(int i=0;i<arr.length;i++) {
            temp += arr[i];
            if(temp==each) {
                temp = 0;
                found++;
            }
        }
        if(found>=3) return true;
        return false;
    }
}