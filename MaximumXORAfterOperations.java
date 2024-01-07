//Maximum xor after operations
//TC:O(n), SC:O(1)
/*Input: nums = [3,2,4,6]
Output: 7
Explanation: Apply the operation with x = 4 and i = 3, num[3] = 6 AND (6 XOR 4) = 6 AND 2 = 2.
Now, nums = [3, 2, 4, 2] and the bitwise XOR of all the elements = 3 XOR 2 XOR 4 XOR 2 = 7.
It can be shown that 7 is the maximum possible bitwise XOR.
Note that other operations may be used to achieve a bitwise XOR of 7*/
class Solution {
    public int maximumXOR(int[] nums) {
        int result = 0;
        for(int a:nums) {
            result |= a;
        }
        return result;
    }
}