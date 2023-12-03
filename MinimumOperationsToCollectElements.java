//Minimum operations to collect elements
//TC:O(n), SC:O(n)
//Input: nums = [3,1,5,4,2], k = 2
//Output: 4
class Solution {
    public int minOperations(List<Integer> nums, int k) {
        int n = 0;
        Set<Integer> set = new HashSet<>();
        for(int i=1;i<=k;i++){
            set.add(i);
        }
        for(int i=nums.size()-1;i>=0;i--) {
            if(set.size()==0) break;
            if(set.contains(nums.get(i))) {
                set.remove(nums.get(i));
            }
            n++;
        }
        return n;
    }
}