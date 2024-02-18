//Defuse the bomb
//TC:O(n), SC:O(1)
/*Input: code = [5,7,1,4], k = 3
Output: [12,10,16,13]
Explanation: Each number is replaced by the sum of the next 3 numbers. The decrypted code is [7+1+4, 1+4+5, 4+5+7, 5+7+1]. Notice that the numbers wrap around.*/
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        return k>0?decrypt(code, new int[n],k,1,k+1):decrypt(code,new int[n],k,n+k,n);
    }
    public int[] decrypt(int[] code, int[] decode,int k, int left, int right) {
        if(k==0) return decode;
        int sum = decode[0] = Arrays.stream(code,left,right).sum();
        for(int i=1, n=decode.length;i<n;i++,left++,right++) {
            decode[i] = sum += code[right%n] - code[left%n];
        }
        return decode;
    }
}