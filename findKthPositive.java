//Kth missing positive number
//TC:O(logn), SC:O(1)
/*Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9*/
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int left = 0, right = arr.length-1;
        while(left<=right) {
            int mid = left + (right-left)/2;
            if(arr[mid]-mid-1<k) {
                left = mid+1;
            } else {
                right = mid-1;
            }
        }
        return left+k;
    }
}