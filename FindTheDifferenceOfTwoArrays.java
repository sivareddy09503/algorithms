//Find the difference of two arrays
//TC:O(n), SC:O(n)
//Input: nums1 = [1,2,3], nums2 = [2,4,6]
//Output: [[1,3],[4,6]]
class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        result.add(new ArrayList<Integer>());
        result.add(new ArrayList<Integer>());
        for(int i:nums1) {
            s1.add(i);
        }
        for(int i:nums2) {
            s2.add(i);
        }
        for(int i:s1) {
            if(!s2.contains(i)) result.get(0).add(i);
        }
        for(int i:s2) {
            if(!s1.contains(i)) result.get(1).add(i);
        }
        return result;
    }
}