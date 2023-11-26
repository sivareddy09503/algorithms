//Points that intersect with cars
//TC:O(mn), SC:O(n)
/*Input: nums = [[3,6],[1,5],[4,7]]
Output: 7
Explanation: All the points from 1 to 7 intersect at least one car, therefore the answer would be 7.*/
class Solution {
    public int numberOfPoints(List<List<Integer>> nums) {
        HashSet<Integer> set = new HashSet<>();
        for(List<Integer> list: nums) {
            for(int i=list.get(0);i<=list.get(1);i++) {
                set.add(i);
            }
        }
        return set.size();
    }
}