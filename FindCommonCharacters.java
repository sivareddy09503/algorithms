//Find common characters
//TC:O(n^2), SC:O(n)
//Input: words = ["bella","label","roller"]
//Output: ["e","l","l"]
class Solution {
    public List<String> commonChars(String[] words) {
        List<String> list = new ArrayList<>();
        char[] c = words[0].toCharArray();
        for(int i=0;i<c.length;i++) {
            if(isContains(c[i],words))
                list.add(String.valueOf(c[i]));
        }
        return list;
    }
    public boolean isContains(char c1, String[] words) {
        for(int i=1;i<words.length;i++) {
            if(!words[i].contains(String.valueOf(c1))) return false;
            else words[i] = words[i].replaceFirst(String.valueOf(c1),"@");
        }
        return true;
    }
}