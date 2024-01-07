//Find positive integer solution for a given equation
//TC:O(1), SC:O(1)
/*Input: function_id = 1, z = 5
Output: [[1,4],[2,3],[3,2],[4,1]]
Explanation: The hidden formula for function_id = 1 is f(x, y) = x + y.
The following positive integer values of x and y make f(x, y) equal to 5:
x=1, y=4 -> f(1, 4) = 1 + 4 = 5.
x=2, y=3 -> f(2, 3) = 2 + 3 = 5.
x=3, y=2 -> f(3, 2) = 3 + 2 = 5.
x=4, y=1 -> f(4, 1) = 4 + 1 = 5.*/
/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i=1;i<=1000;i++) {
            int x = 1, y=1000;
            while(x<y) {
                int mid = (x+y)>>1;
                if(customfunction.f(i,mid)>=z) {
                    y = mid;
                } else {
                    x = mid+1;
                }
            }
            if(customfunction.f(i,x)==z) {
                result.add(Arrays.asList(i,x));
            }
        }
        return result;
    }
}