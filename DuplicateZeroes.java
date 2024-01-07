//Duplicate Zeroes
//TC:O(n), SC:O(1)
/*Input: arr = [1,0,2,3,0,4,5,0]
Output: [1,0,0,2,3,0,0,4]
Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4]*/
class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            if(arr[i]==0 && i+1<n) {
                for(int j=n-1;j>i+1;j--) {
                    arr[j] = arr[j-1];
                }
                arr[i+1] = 0;
                i++;
            }
        }
    }
}