//Bitwise ors of subarrays
//TC:O(n^2), SC:O(1)
/*Input: arr = [0]
Output: 1
Explanation: There is only one possible result: 0*/
class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        Set<Integer> ors = new HashSet<>();
        for(int i=arr.length-1;i>=0;i--) {
            ors.add(arr[i]);
            for(int j=i+1;j<arr.length;j++) {
                if((arr[j] | arr[i])==arr[j]) break;
                arr[j] |= arr[i];
                ors.add(arr[j]);
            }
        }
        return ors.size();
    }
}