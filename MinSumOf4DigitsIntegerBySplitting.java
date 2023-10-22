//Min sum of 4 digits number by splitting
//TC:O(nlogn), SC:O(n)
//Input: num = 2932
//Output: 52
class Solution {
    public int minimumSum(int num) {
        int[] arr = new int[4];
        for(int i=0;i<arr.length;i++) {
            arr[i] = num%10;
            num = num/10;
        }
        Arrays.sort(arr);
        int s1 = arr[0]*10 + arr[2];
        int s2 = arr[1]*10 + arr[3];
        return s1+s2;
    }
}