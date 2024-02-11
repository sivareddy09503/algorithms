//x of a kind in a deck of cards
//TC:O(n), SC:O(n)
/*Input: deck = [1,2,3,4,4,3,2,1]
Output: true
Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].*/
class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i:deck) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int gcd = 0;
        for(int val:map.values()) {
            gcd = gcd(gcd, val);
        }
        return gcd>1;
    }
    public int gcd(int a, int b) {
        return (b==0)?a:gcd(b,a%b);
    }
}