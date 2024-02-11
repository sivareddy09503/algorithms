//The k weakest rows in a matrix
//TC:O(n^2),SC:O(n)
/*Input: mat = 
[[1,1,0,0,0],
 [1,1,1,1,0],
 [1,0,0,0,0],
 [1,1,0,0,0],
 [1,1,1,1,1]], 
k = 3
Output: [2,0,3]
Explanation: 
The number of soldiers in each row is: 
- Row 0: 2 
- Row 1: 4 
- Row 2: 1 
- Row 3: 2 
- Row 4: 5 
The rows ordered from weakest to strongest are [2,0,3,1,4].*/
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i =0;i<mat.length;i++) {
            int count = 0;
            for(int j= 0;j<mat[0].length;j++) {
                if(mat[i][j]==1) count++;
            }
            map.put(i,count);
        }
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b) ->map.get(a)-map.get(b));
        int[] ans = new int[k];
        for(int i=0;i<k;i++) {
            ans[i] = list.get(i);
        }
        return ans;
    }
}