//Best poker hand
//TC:O(n), SC:O(n)
/*Input: ranks = [13,2,3,1,9], suits = ["a","a","a","a","a"]
Output: "Flush"
Explanation: The hand with all the cards consists of 5 cards with the same suit, so we have a "Flush".*/
class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        Map<Integer,Integer> rankmap = new HashMap<>();
        Map<Character, Integer> suitmap = new HashMap<>();
        for(int r:ranks) {
            rankmap.put(r, rankmap.getOrDefault(r,0)+1);
        }
        for(char s: suits) {
            suitmap.put(s,suitmap.getOrDefault(s,0)+1);
        }
        if(suitmap.containsValue(5)) {
            return "Flush";
        }
        if( rankmap.containsValue(5) || rankmap.containsValue(4) || rankmap.containsValue(3)) {
            return "Three of a Kind";
        }
        if(rankmap.containsValue(2)) {
            return "Pair";
        }
        return "High Card";
    }
}