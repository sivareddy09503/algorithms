class Solution {
    //Hamming Distance
    //TC:O(1),SC:O(1)
    //Input: x = 1, y = 4
    //Output: 2
    public int hammingDistance(int x, int y) {
        int count = 0;
        int xor = x ^ y;
        int mask = 1;
        for(int i=0;i<32;i++) {
            if((xor & mask) != 0)
                count++;
            mask *= 2;
        }
        return count;
    }
}