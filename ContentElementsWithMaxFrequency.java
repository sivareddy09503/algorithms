//Count elements with maximum frequency
//TC:O(n), SC:O(n)
/*Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.*/
class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> frqs = new HashMap<>();
        int maxFreq = 0, cntMaxFreq = 0;
        for(int num : nums) {
            int frq = frqs.getOrDefault(num,0)+1;
            if(frq == maxFreq) cntMaxFreq++;
            else if (frq>maxFreq) {
                maxFreq = frq;
                cntMaxFreq = 1;
            }
            frqs.put(num,frq);
        }
        return maxFreq * cntMaxFreq;
    }
}