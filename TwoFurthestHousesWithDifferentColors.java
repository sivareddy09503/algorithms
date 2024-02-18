//two-furthest-houses-with-different-colors
//TC:O(n),SC:(1)
/*Input: colors = [1,1,1,6,1,1,1]
Output: 3
Explanation: In the above image, color 1 is blue, and color 6 is red.
The furthest two houses with different colors are house 0 and house 3.
House 0 has color 1, and house 3 has color 6. The distance between them is abs(0 - 3) = 3.
Note that houses 3 and 6 can also produce the optimal answer.*/
class Solution {
    public int maxDistance(int[] colors) {
        int n=colors.length, i=0,j=n-1;
        while(colors[0]==colors[j]) {
            --j;
        }
        while(colors[n-1]==colors[i]) {
            ++i;
        }
        return Math.max(j,n-i-1);
    }
}