//Combinations Sum
//TC:O(n*2^k), SC:O(1)
//Input: candidates = [2,3,6,7], target = 7
//Output: [[2,2,3],[7]]
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(list, candidates, new ArrayList<>(), target, 0, 0);
        return list;
    }
    public static void dfs(List<List<Integer>> list, int[] nums, List<Integer> comb, int target, int sum, int start) {
        if(target == sum) {
            list.add(new ArrayList<>(comb));
            return;
        } else if(sum>target) return;
        for(int i=start;i<nums.length;i++){
            comb.add(nums[i]);
            dfs(list,nums,comb,target,sum+nums[i],i);
            comb.remove(comb.size()-1);
        }
    }
}