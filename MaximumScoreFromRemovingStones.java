//Maximum score from removing stones
//TC:O(1), SC:O(1)
/*The starting state is (2, 4, 6). One optimal set of moves is:
- Take from 1st and 3rd piles, state is now (1, 4, 5)
- Take from 1st and 3rd piles, state is now (0, 4, 4)
- Take from 2nd and 3rd piles, state is now (0, 3, 3)
- Take from 2nd and 3rd piles, state is now (0, 2, 2)
- Take from 2nd and 3rd piles, state is now (0, 1, 1)
- Take from 2nd and 3rd piles, state is now (0, 0, 0)
There are fewer than two non-empty piles, so the game ends. Total: 6 points.*/
class Solution {
    public int maximumScore(int a, int b, int c) {
        int max = (a>=b && a>=c) ? a: (b>=a && b>=c) ? b : c;
        int min = (a<=b && a<=c) ? a: (b<=a && b<=c) ? b : c;
        int mid = (a+b+c) - (max+min);
        if(max>=(mid+min)) return mid+min;
        else return max+((min+mid)-max)/2;
    }
}