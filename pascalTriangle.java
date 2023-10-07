//Pascal's Triangle 2 - find rowIndex row values using DP
//TC:O(n^2), SC:O(n)
//Input: rowIndex = 3
//Output: [1,3,3,1]
class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++) {
            row.add(1);
            for(int j=i-1;j>0;j--) {
                row.set(j,row.get(j)+row.get(j-1));
            }
        }
        return row;
    }
}