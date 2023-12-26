//Available captures for Rook
//TC:O(n^2), SC:O(1)
/*Input: board = [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
Output: 3
Explanation: In this example, the rook is attacking all the pawns*/
class Solution {
    public int numRookCaptures(char[][] board) {
        int count = 0, m = 0, n = 0;
        for(int a=0;a<board.length;a++) {
            char[] array =  board[a];
            for(int b=0;b<array.length;b++) {
                if(array[b]=='R') {
                    m = a;
                    n = b;
                    break;
                }
            }
        }
        int d1 = m;
        while(d1<7) {
            d1++;
            if(board[d1][n]=='p') {
                count++;
                break;
            } else if(board[d1][n]=='B') {
                break;
            }
        }
        d1 = m;
        while(d1>0) {
            d1--;
            if(board[d1][n]=='p') {
                count++;
                break;
            } else if(board[d1][n]=='B') {
                break;
            }
        }
        int d2 = n;
        while(d2<7) {
            d2++;
            if(board[m][d2]=='p') {
                count++;
                break;
            } else if(board[m][d2]=='B') {
                break;
            }
        }
        d2=n;
        while(d2>0) {
            d2--;
            if(board[m][d2]=='p') {
                count++;
                break;
            } else if(board[m][d2]=='B') {
                break;
            }
        }
        return count;
    }
}