//sort-array-by-increasing-frequency
//TC:O(n^2),SC:O(n)
/*Input: nums = [1,1,2,2,2,3]
Output: [3,1,1,2,2,2]
Explanation: '3' has a frequency of 1, '1' has a frequency of 2, and '2' has a frequency of 3.*/
class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num:nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->{
            return (map.get(a)==map.get(b))?b-a:map.get(a)-map.get(b);
            });
        int[] res = new int[nums.length];
        int i=0;
        for(int num:list) {
            for(int j=0;j<map.get(num);j++) {
                res[i++]=num;
            }
        }
        return res;
    }
}