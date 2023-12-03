//Find words containing characters
//TC:O(n),SC:O(1)
/*Input: words = ["leet","code"], x = "e"
Output: [0,1]
Explanation: "e" occurs in both words: "leet", and "code". Hence, we return indices 0 and 1*/
class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        for(String y:words){
            if(y.contains(String.valueOf(x))) list.add(index);
            index++;
        }
        return list;
    }
}