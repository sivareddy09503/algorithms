//Merge two 2d arrays by summing values
//TC:O(n), SC:O(n)
/*Input: nums1 = [[1,2],[2,3],[4,5]], nums2 = [[1,4],[3,2],[4,1]]
Output: [[1,6],[2,3],[3,2],[4,6]]
Explanation: The resulting array contains the following:
- id = 1, the value of this id is 2 + 4 = 6.
- id = 2, the value of this id is 3.
- id = 3, the value of this id is 2.
- id = 4, the value of this id is 5 + 1 = 6.*/
class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        List<int[]> list = new ArrayList<>();
        int[][] result;
        int ind1 = 0, ind2 = 0;
        int n1 = nums1.length, n2 = nums2.length;
        while(ind1<n1 && ind2<n2) {
            if(nums1[ind1][0]==nums2[ind2][0]) {
                nums1[ind1][1] += nums2[ind2][1];
                list.add(nums1[ind1]);
                ind1++;
                ind2++;
            } else if(nums1[ind1][0]<nums2[ind2][0]) {
                list.add(nums1[ind1]);
                ind1++;
            } else {
                list.add(nums2[ind2]);
                ind2++;
            }
        }
        while(ind1<n1) {
            list.add(nums1[ind1]);
            ind1++;
        }
        while(ind2<n2) {
            list.add(nums2[ind2]);
            ind2++;
        }
        result = new int[list.size()][2];
        for(int i=0; i<list.size();i++) {
            result[i] = list.get(i);
        }
        return result;
    }
}