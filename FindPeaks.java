//Find the peaks
//TC:O(n), SC:O(n)
/*Input: mountain = [1,4,3,8,5]
Output: [1,3]
Explanation: mountain[0] and mountain[4] can not be a peak because they are first and last elements of the array.
mountain[2] also can not be a peak because it is not strictly greater than mountain[3] and mountain[1].
But mountain [1] and mountain[3] are strictly greater than their neighboring elements.
So the answer is [1,3].*/
class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> res = new ArrayList<>();
        for(int i=1;i<mountain.length-1;i++) {
            if(mountain[i]>mountain[i-1] && mountain[i]>mountain[i+1]) {
                res.add(i);
            }
        }
        return res;
    }
}