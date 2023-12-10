//Two out of three unique numbers
//TC:O(n), SC:O(n)
/*Input: nums1 = [1,1,3,2], nums2 = [2,3], nums3 = [3]
Output: [3,2]
Explanation: The values that are present in at least two arrays are:
- 3, in all three arrays.
- 2, in nums1 and nums2.*/
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num:nums1) {
            set1.add(num);
        }
        for(int num:nums2) {
            set2.add(num);
        }
        for(int num:nums2) {
            if(set1.contains(num) && !list.contains(num)) {
                list.add(num);
            }    
        }
        for(int num:nums3) {
            if(set1.contains(num) && !list.contains(num)) {
                list.add(num);
            } 
            if(set2.contains(num) && !list.contains(num)) {
                list.add(num);
            }  
        }
        return list;
    }
}