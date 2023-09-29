//Permutations
//TC:O(n*n!)+ O(nlogn), SC:O(n)
//Input: nums = [1,2,3]
//Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        dfs(list,nums,new ArrayList<>());
        return list;
    }
    public static void dfs(List<List<Integer>> list, int[] nums, List<Integer> perm) {
        if(nums.length == perm.size()) {
            list.add(new ArrayList<>(perm));
        }
        for(int i=0; i<nums.length;i++) {
            if(perm.contains(nums[i])) continue;
            perm.add(nums[i]);
            dfs(list, nums, perm);
            perm.remove(perm.size()-1);
        }
    }
}