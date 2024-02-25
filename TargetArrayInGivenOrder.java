//create-target-array-in-the-given-order
//TC:O(n),SC:O(n)
/*Input: nums = [0,1,2,3,4], index = [0,1,2,2,1]
Output: [0,4,1,3,2]
Explanation:
nums       index     target
0            0        [0]
1            1        [0,1]
2            2        [0,1,2]
3            2        [0,1,3,2]
4            1        [0,4,1,3,2]*/
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> ans = new ArrayList<>();
        int[] res = new int[nums.length];
        for(int i=0;i<nums.length;i++) {
            ans.add(index[i],nums[i]);
        }
        int h=0;
        for(int a:ans) {
            res[h++]=a;
        }
        return res;
    }
}