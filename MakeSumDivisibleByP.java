//Make sum divisible by the given number
//TC:O(n), SC:O(n)
/*Input: nums = [3,1,4,2], p = 6
Output: 1
Explanation: The sum of the elements in nums is 10, which is not divisible by 6. We can remove the subarray [4], and the sum of the remaining elements is 6, which is divisible by 6*/
class Solution {
    public int minSubarray(int[] nums, int p) {
        long sum = 0;
        for(int num : nums) {
            sum = (sum+num)%p;
        }
        if(sum%p==0) return 0;
        int rem = ((int)sum%p + p) %p;
        Map<Integer,Integer> map = new HashMap<>();
        int n = nums.length, len = n;
        long pSum = 0;
        map.put(0,-1);
        for(int i=0;i<n;i++) {
            pSum = (pSum+nums[i])%p;
            int currRem = ((int)pSum%p + p) %p;
            map.put(currRem,i);
            int remToSearch = ((currRem-rem)%p+p)%p;
            if(map.containsKey(remToSearch)) {
                len = Math.min(len, i-map.get(remToSearch));
            }
        }
        if(len==n) return -1;
        return len;

    }
}