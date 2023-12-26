//Merge Similar items
//TC:O(n), SC:O(n)
/*Input: items1 = [[1,1],[4,5],[3,8]], items2 = [[3,1],[1,5]]
Output: [[1,6],[3,9],[4,5]]
Explanation: 
The item with value = 1 occurs in items1 with weight = 1 and in items2 with weight = 5, total weight = 1 + 5 = 6.
The item with value = 3 occurs in items1 with weight = 8 and in items2 with weight = 1, total weight = 8 + 1 = 9.
The item with value = 4 occurs in items1 with weight = 5, total weight = 5.  
Therefore, we return [[1,6],[3,9],[4,5]]*/
class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        int n1 = items1.length, n2 = items2.length;
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<n1;i++) {
            map.put(items1[i][0],items1[i][1]);
        }
        for(int i=0;i<n2;i++) {
            if(map.containsKey(items2[i][0])) {
                int temp = map.get(items2[i][0]);
                temp += items2[i][1];
                map.put(items2[i][0],temp);
            } else {
                map.put(items2[i][0],items2[i][1]);
            }
        }
        List<List<Integer>> res = new ArrayList<>();
        for(int key:map.keySet()) {
            List<Integer> list = new ArrayList<>();
            list.add(key);
            list.add(map.get(key));
            res.add(list);
        }
        return res;
    }
}