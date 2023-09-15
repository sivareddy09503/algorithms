class FindKDiffPairs {
    //K-diff Pairs in an Array
    //Input: nums = [3,1,4,1,5], k = 2
    //Output: 2
    //Explanation: There are two 2-diff pairs in the array, (1, 3) and (3, 5).
    //TC:O(n), SC:O(n)
    public int findPairs(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++) {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int count = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()) {
            if(k==0) {
                if(entry.getValue()>=2) {
                    count++;
                }
            } else {
                if(map.containsKey(entry.getKey()+k)) {
                    count++;
                }
            }

        }
        return count;
    }
}