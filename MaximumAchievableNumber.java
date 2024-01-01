//Find maximum achievable number
//TC:O(n), SC:O(1)
/*Input: num = 4, t = 1
Output: 6
Explanation: The maximum achievable number is x = 6; it can become equal to num after performing this operation:
1- Decrease x by 1, and increase num by 1. Now, x = 5 and num = 5. 
It can be proven that there is no achievable number larger than 6.*/
class Solution {
    public int theMaximumAchievableX(int num, int t) {
        int size = num+t;
        for(int i=0;i<t;i++) size++;
        return size;
    }
}