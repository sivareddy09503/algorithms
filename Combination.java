//Combinations
//TC:O(k * nck), SC: O(k)
//Input: n = 4, k = 2
//Output: [[1,2],[1,3],[1,4],[2,3],[2,4],[3,4]]
class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        dfs(list, new ArrayList<>(),n,k,1);
        return list;
    }
    public static void dfs(List<List<Integer>> list, List<Integer> comb, int n, int k, int start) {
        if(comb.size()==k) {
            list.add(new ArrayList<>(comb));
            return;
        }
        for(int i=start; i<=n;i++) {
            comb.add(i);
            dfs(list, comb, n, k, i+1);
            comb.remove(comb.size()-1);
        }
    }
}