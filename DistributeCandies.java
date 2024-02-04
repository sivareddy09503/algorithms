//Distribute candies
//TC:O(n), SC:O(n)
/*Input: candyType = [1,1,2,2,3,3]
Output: 3
Explanation: Alice can only eat 6 / 2 = 3 candies. Since there are only 3 types, she can eat one of each type.*/
class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for(int candy:candyType)
            set.add(candy);
        return Math.min(set.size(),candyType.length/2);
    }
}