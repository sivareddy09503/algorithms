//cells-with-odd-values-in-a-matrix
//TC:O(n), SC:O(n)
/*Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.*/
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
       int[] r = new int[m];
       int[] c = new int[n];
       for(int i=0;i<indices.length;i++) {
           r[indices[i][0]]++;
           c[indices[i][1]]++;
       }
       int oddRows = 0;
       for(int i=0;i<m;i++) {
           if(r[i]%2==1) oddRows++;
       }
       int oddCols = 0;
       for(int i=0;i<n;i++) {
           if(c[i]%2==1) oddCols++;
       }
       return oddRows*n + oddCols * m - 2*oddRows*oddCols;
     }
}
