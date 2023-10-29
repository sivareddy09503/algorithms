//Number of Employees who met the target
//TC:O(n), SC:O(1)
//Input: hours = [0,1,2,3,4], target = 2
//Output: 3
class Solution {
    public int numberOfEmployeesWhoMetTarget(int[] hours, int target) {
        int count = 0;
        for(int i=0;i<hours.length;i++) {
            if(hours[i]>=target) count++;
        }
        return count;
    }
}