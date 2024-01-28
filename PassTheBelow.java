//Pass the pillow
//TC:O(n), SC:O(1)
/*Input: n = 4, time = 5
Output: 2
Explanation: People pass the pillow in the following way: 1 -> 2 -> 3 -> 4 -> 3 -> 2.
Afer five seconds, the pillow is given to the 2nd person.*/
class Solution {
    public int passThePillow(int n, int time) {
        int curr = 1;
        int d = 1;
        int ela = 0;
        while(ela<time) {
            curr +=d;
            if(curr==n || curr==1) {
                d = -d;
            }
            ela++;
        }
        return curr;
    }
}