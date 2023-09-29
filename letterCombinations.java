//Letter Combinations of a Phone number
//TC:O(4^n), SC:O(n)
//Input: digits = "23"
//Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
class Solution {
    public List<String> letterCombinations(String digits) {
        LinkedList<String> list = new LinkedList<>();
        if(digits.length() == 0) return list;
        list.add("");
        String[] map = new String[]{"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for(int i=0; i<digits.length();i++) {
            int index = Character.getNumericValue(digits.charAt(i));
            while(list.peek().length() == i) {
                String tmp = list.remove();
                for(char ch: map[index].toCharArray()) {
                    list.add(tmp + ch);
                }
            }
        }
        return list;
    }
}