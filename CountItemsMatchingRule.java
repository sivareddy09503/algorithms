//count-items-matching-a-rule
//TC:O(n), SC:O(1)
/*Input: items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].*/
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        int index = (ruleKey.equals("type"))?0:(ruleKey.equals("color"))?1:2;
        for(List list:items) {
            if(list.get(index).equals(ruleValue)) count++;
        }
        return count;
    } 
}