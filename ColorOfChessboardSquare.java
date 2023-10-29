//Determine color of a Chessboard Square
//TC:O(1), SC:O(1)
//Input: coordinates = "a1"
//Output: false
//Explanation: From the chessboard above, the square with coordinates "a1" is black, so return false.
class Solution {
    public boolean squareIsWhite(String coordinates) {
        int a = coordinates.charAt(0);
        int b = coordinates.charAt(1);
        if((a%2 == 0 && b%2!=0) ||(a%2 != 0 && b%2 == 0)) return true;
        else return false;
    }
}