//Minimum common values
//TC:O(n), SC:O(1)
/*Input: nums1 = [1,2,3], nums2 = [2,4]
Output: 2
Explanation: The smallest element common to both arrays is 2, so we return 2*/
class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
       /* int min = -1;
        Set<Integer> set = new HashSet<Integer>();
        for(int num:nums1) {
            set.add(num);
        }
        for(int num:nums2) {
            if(set.contains(num)) {
                min = num;
                break;
            }
        }
        return min;*/
        int l = 0, h = 0;
        while(l<nums1.length && h<nums2.length) {
            if(nums1[l]==nums2[h]) {
                return nums1[l];
            } else {
                if(nums1[l]<nums2[h]) {
                    l++;
                } else {
                    h++;
                }
            }
        }
        return -1;
    }
}