//Number of Distinct Averages
//TC:O(n^2), SC:O(n)
//Input: nums = [4,1,4,0,3,5]
//Output: 2
class Solution {
    public int distinctAverages(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i: nums) list.add(i);
        Set<Double> set = new HashSet<>();
        while(!list.isEmpty()) {
            int max = Collections.max(list);
            int min = Collections.min(list);
            double avg = (max+min)/2.0;
            set.add(avg);
            list.remove(Integer.valueOf(max));
            list.remove(Integer.valueOf(min));
        }
        return set.size();
    }
}