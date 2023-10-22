//Intersection of two arrays
//TC:O(n), SC:O(n)
//Input: nums1 = [1,2,2,1], nums2 = [2,2]
//Output: [2]
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> result = new ArrayList<>();
        Set<Integer> s1 = new HashSet<>();
        Set<Integer> s2 = new HashSet<>();
        for(int i:nums1) {
            s1.add(i);
        }
        for(int i:nums2) {
            s2.add(i);
        }
        for(int i:s1) {
            if(s2.contains(i)) result.add(i);
        }
        int[] arr = new int[result.size()];
        for(int i=0;i<arr.length;i++){
            arr[i] = result.get(i);
        }
        return arr;
    }
}