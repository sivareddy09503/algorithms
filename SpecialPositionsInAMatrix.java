//special-positions-in-a-binary-matrix
//TC:O(mn), SC:O(n)
/*Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
Output: 1
Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.*/
class Solution {
    public int numSpecial(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] rowCount = new int[m];
        int[] colCount = new int[n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                if(mat[i][j]==1){
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }
        int ans=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                if(mat[i][j]==1){
                    if(rowCount[i]==1&&colCount[j]==1) ans++;
                }
            }
        }
        return ans++;
    }
}