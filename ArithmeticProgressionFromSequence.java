//can-make-arithmetic-progression-from-sequence
//TC:O(nlogn),SC:O(1)
/*Input: arr = [3,5,1]
Output: true
Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.*/
class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int diff = arr[1]-arr[0];
        for(int i=1;i<arr.length-1;i++) {
            if(arr[i+1]-arr[i]==diff) {
                continue;
            } else {
                return false;
            }
        }
        return true;
    }
}