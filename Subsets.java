//Subsets
//TC:O(n!), SC:O(n^2)
//Input: nums = [1,2,3]
//Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(list, new ArrayList<>(),nums,0);
        return list;
    }
    public void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start) {
        list.add(new ArrayList<>(tempList));
        for(int i=start;i<nums.length;i++) {
            tempList.add(nums[i]);
            backtrack(list,tempList,nums,i+1);
            tempList.remove(tempList.size()-1);
        }
    }
}