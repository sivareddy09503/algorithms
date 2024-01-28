//Decoded xored array
//TC:O(n), SC:O(1)
/*Input: encoded = [1,2,3], first = 1
Output: [1,0,2,1]
Explanation: If arr = [1,0,2,1], then first = 1 and encoded = [1 XOR 0, 0 XOR 2, 2 XOR 1] = [1,2,3]*/
class Solution {
    public int[] decode(int[] encoded, int first) {
        int[] arr = new int[encoded.length+1];
        arr[0] = first;
        for(int i=1;i<encoded.length+1;i++) {
            arr[i] = arr[i-1]^encoded[i-1];
        }
        return arr;
    }
}