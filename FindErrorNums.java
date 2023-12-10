//Set mismatch
//TC:O(n), SC:O(n)
//Input: nums = [1,2,2,4]
//Output: [2,3]
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[nums.length+1];
        for(int i:nums){
            result[i]++;
        }
        int dup=0, miss=0;
        for(int i=1;i<result.length;i++){
            if(result[i]==2) dup=i;
            if(result[i]==0) miss=i;
        }
        return new int[]{dup,miss};
    }
}