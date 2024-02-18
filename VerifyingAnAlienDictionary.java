//verifying-an-alien-dictionary
//TC:O(n), SC:O(1)
/*Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.*/
class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] key = new int[26];
        for(int i=0;i<26;i++) {
            key[order.charAt(i)-'a']=i;
        }
        for(int i=1;i<words.length;i++) {
            if(compare(words[i],words[i-1],key)<0) return false;
        }
        return true;
    }
    private int compare(String a, String b, int[] key) {
        int mn = Math.min(a.length(),b.length());
        for(int i=0;i<mn;i++) {
            int res = key[a.charAt(i)-'a']-key[b.charAt(i)-'a'];
            if(res!=0) return res;
        }
        return a.length()-b.length();
    }
}