//Distribute candies to people
//TC:O(n^2), SC:O(1)
/*Input: candies = 7, num_people = 4
Output: [1,2,3,1]
Explanation:
On the first turn, ans[0] += 1, and the array is [1,0,0,0].
On the second turn, ans[1] += 2, and the array is [1,2,0,0].
On the third turn, ans[2] += 3, and the array is [1,2,3,0].
On the fourth turn, ans[3] += 1 (because there is only one candy left), and the final array is [1,2,3,1].*/
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] arr = new int[num_people];
        int currCandies = 1;
        while(candies>0) {
            for(int i=0;i<num_people;i++) {
                if(candies>=currCandies) {
                    arr[i] += currCandies;
                    candies -= currCandies;
                    currCandies++;
                } else {
                    arr[i] += candies;
                    candies = 0;
                }
            }
        }
        return arr;
    }
}