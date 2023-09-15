class TwoSum {
    //Two Sum
    //Input: nums = [2,7,11,15], target = 9
    //Output: [0,1]
    //TC:O(n), SC:O(n)
    public int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                ans[0] = i;
                ans[1] = map.get(diff);
                break;
            } else {
                map.put(nums[i], i);
            }
        }
        return ans;
    }
}