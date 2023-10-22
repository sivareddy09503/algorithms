//Kids with the greatest number of candies
//TC:O(n), SC:O(n)
//Input: candies = [2,3,5,1,3], extraCandies = 3
//Output: [true,true,true,false,true] 
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>(candies.length);
        int max = 0;
        for(int i=0;i<candies.length;i++) {
            if(candies[i]>max) {
                max = candies[i];
            }
        }
        for(int i=0;i<candies.length;i++) {
            if(candies[i] + extraCandies >= max) {
                res.add(true);
            } else {
                res.add(false);
            }
        }
        return res;
    }
}