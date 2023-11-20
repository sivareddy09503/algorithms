//Determine the winner of a bowling game
//TC:O(n), SC:O(1)
//Input: player1 = [4,10,7,9], player2 = [6,5,2,3]
//Output: 1
class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int sum1 =0, sum2=0, count = 0;
        for(int i=0;i<player1.length;i++) {
            if(player1[i]>=10) {
                if(count>0) {
                    sum1 += 2*player1[i];
                    count =2;
                    continue;
                }
                count = 2;
                sum1 += player1[i];
                continue;
            }
            if(count>0) {
                count--;
                sum1 += 2*player1[i];
            } else {
                sum1 += player1[i];
            }
        }
        count = 0;
        for(int i=0;i<player2.length;i++) {
            if(player2[i]>=10) {
                if(count>0) {
                    sum2 += 2*player2[i];
                    count =2;
                    continue;
                }
                count = 2;
                sum2 += player2[i];
                continue;
            }
            if(count>0) {
                count--;
                sum2 += 2*player2[i];
            } else {
                sum2 += player2[i];
            }
        }
        if(sum1>sum2) return 1;
        else if(sum1<sum2) return 2;
        else return 0;
    }
}