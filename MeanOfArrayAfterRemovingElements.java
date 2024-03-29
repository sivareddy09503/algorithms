//mean-of-array-after-removing-some-elements
//TC:O(nlogn), SC:O(1)
/*Input: arr = [1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,3]
Output: 2.00000
Explanation: After erasing the minimum and the maximum values of this array, all elements are equal to 2, so the mean is 2*/
class Solution {
    public double trimMean(int[] arr) {
        double n = (0.05*arr.length);
        Arrays.sort(arr);
        double sum = 0;
        for(int i=(int)n;i<arr.length-n;i++) {
            sum = sum + arr[i];
        }
        double len = arr.length-2*n;
        sum = sum/len;
        return sum;
    }
}