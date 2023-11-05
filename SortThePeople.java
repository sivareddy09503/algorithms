//Sort the people
//TC:O(n), SC:O(n)
//Input: names = ["Mary","John","Emma"], heights = [180,165,170]
//Output: ["Mary","Emma","John"]
class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Map<Integer,String> map = new TreeMap<>();
        String[] sorted = new String[names.length];
        int index = names.length - 1;
        for(int i=0;i<names.length;i++) {
            map.put(heights[i],names[i]);
        }
        for(Integer key:map.keySet()) {
            sorted[index--] = map.get(key);
        }
        return sorted;
    }
}