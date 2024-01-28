//Count tested devices after test operations
//TC:O(n^2), SC:O(1)
/*Input: batteryPercentages = [1,1,2,1,3]
Output: 3
Explanation: Performing the test operations in order starting from device 0:
At device 0, batteryPercentages[0] > 0, so there is now 1 tested device, and batteryPercentages becomes [1,0,1,0,2].
At device 1, batteryPercentages[1] == 0, so we move to the next device without testing.
At device 2, batteryPercentages[2] > 0, so there are now 2 tested devices, and batteryPercentages becomes [1,0,1,0,1].
At device 3, batteryPercentages[3] == 0, so we move to the next device without testing.
At device 4, batteryPercentages[4] > 0, so there are now 3 tested devices, and batteryPercentages stays the same.
So, the answer is 3.*/
class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int ans = 0;
        for(int i=0;i<batteryPercentages.length;i++) {
            if(batteryPercentages[i]>0) {
                ans++;
                for(int j=i+1;j<batteryPercentages.length;j++) {
                    if(batteryPercentages[j]>0) {
                        batteryPercentages[j] = batteryPercentages[j] - 1;
                    }
                }
            }
        }
        return ans;
    }
}