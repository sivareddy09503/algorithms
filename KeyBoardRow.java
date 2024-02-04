//Keyboard Row
//TC:O(n), SC:O(1)
/*Input: words = ["Hello","Alaska","Dad","Peace"]
Output: ["Alaska","Dad"]*/
class Solution {
    public String[] findWords(String[] words) {
        int[] rowMap = new int[26];
        String[] rows = {"QWERTYUIOP", "ASDFGHJKL", "ZXCVBNM"};
        for(int i=0;i<rows.length;i++) {
            for(char c:rows[i].toCharArray()) {
                rowMap[c-'A'] = i;
            }
        }
        List<String> result = new ArrayList<>();
        for(String word:words) {
            int row = rowMap[word.toUpperCase().charAt(0)-'A'];
            boolean onSameRow = true;
            for(char c: word.toUpperCase().toCharArray()) {
                if(rowMap[c-'A']!=row) {
                    onSameRow = false;
                    break;
                }
            }
            if(onSameRow) {
                result.add(word);
            }
        }
        return result.toArray(new String[0]);
    }
}