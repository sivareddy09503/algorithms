//Next greater element
//TC:O(n^3), SC:O(n)
/*Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]
Explanation: The next greater element for each value of nums1 is as follows:
- 4 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.
- 1 is underlined in nums2 = [1,3,4,2]. The next greater element is 3.
- 2 is underlined in nums2 = [1,3,4,2]. There is no next greater element, so the answer is -1.*/
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        for(int i=0;i<nums1.length;i++) {
            int max = -1;
            for(int j = 0;j<nums2.length;j++) {
                int index = j;
                if(nums1[i] == nums2[j]) {
                    while(index != nums2.length) {
                        if(nums2[index]>nums1[i]) {
                            max = nums2[index];
                            break;
                        }
                        index++;
                    }
                }
            }
            ans[i] = max;
        }
        return ans;
    }
}