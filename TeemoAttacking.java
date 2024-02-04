//Teemo attacking
//TC:O(n), SC:O(1)
/*Input: timeSeries = [1,4], duration = 2
Output: 4
Explanation: Teemo's attacks on Ashe go as follows:
- At second 1, Teemo attacks, and Ashe is poisoned for seconds 1 and 2.
- At second 4, Teemo attacks, and Ashe is poisoned for seconds 4 and 5.
Ashe is poisoned for seconds 1, 2, 4, and 5, which is 4 seconds in total.*/
class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total_duration = 0;
        for(int i=0, prev_end = timeSeries[0]-1;i<timeSeries.length;prev_end=timeSeries[i]+duration-1,i++) {
            total_duration += timeSeries[i]<=prev_end ? duration -(prev_end-timeSeries[i]+1):duration;
        }
        return total_duration;
    }
}