//Calculate delayed arrival time
//TC:O(1), SC:O(1)
//Input: arrivalTime = 15, delayedTime = 5 
//Output: 20 
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime+delayedTime)%24;
    }
}