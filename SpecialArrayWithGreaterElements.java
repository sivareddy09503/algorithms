//Special array with x elements greater than or equal to x
//TC:O(n), SC:O(n)
/*Input: nums = [3,5]
Output: 2
Explanation: There are 2 values (3 and 5) that are greater than or equal to 2*/
class Solution {
    public int specialArray(int[] nums) {
        int result = 0;
        int x = nums.length;
        int[] count = new int[x+1];
        for(int num:nums) {
            if(num>=x) {
                count[x]++;
            } else {
                count[num]++;
            }
        }
        for(int i=count.length-1;i>0;i--) {
            result +=count[i];
            if(result == i) return i;
        }
        return -1;
    }
}