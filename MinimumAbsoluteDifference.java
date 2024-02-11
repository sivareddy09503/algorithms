//Minimum absolute difference
//TC:O(nlogn), SC:O(n)
/*Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.*/
class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<arr.length-1;i++) {
            int diff = arr[i+1]-arr[i];
            if(diff<min) {
                min = diff;
                res.clear();
                res.add(Arrays.asList(arr[i],arr[i+1]));
            } else if(diff == min) {
                res.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return res;
    }
}