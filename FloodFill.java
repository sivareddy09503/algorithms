//Flood fill
//TC:O(n^2), SC:O(n^2)
//Input: image = [[1,1,1],[1,1,0],[1,0,1]], sr = 1, sc = 1, color = 2
//Output: [[2,2,2],[2,2,0],[2,0,1]]
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int m = image.length;
        int n = image[0].length;
        int origColor = image[sr][sc];
        if(origColor==color) return image;
        dfs(image,sr,sc,origColor,color);
        return image;
    }
    public void dfs(int[][] image, int row, int col, int origColor, int newColor) {
        if(row<0 || col<0 || row==image.length || col==image[0].length || image[row][col]!=origColor) {
            return;
        }
        image[row][col] = newColor;
        dfs(image,row-1,col,origColor,newColor);
        dfs(image,row+1,col,origColor,newColor);
        dfs(image,row,col-1,origColor,newColor);
        dfs(image,row,col+1,origColor,newColor);
    }
}