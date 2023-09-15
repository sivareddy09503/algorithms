class Solution {
    //Ransom Note
    //Input: ransomNote = "aa", magazine = "aab"
    //Output: true
    //TC:O(n), SC:O(1)
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] frequency = new int[26];
        for(int i=0; i<magazine.length();i++) {
            char c = magazine.charAt(i);
            frequency[c-'a']++;
        }
        for(int i=0; i<ransomNote.length();i++) {
            char c = ransomNote.charAt(i);
            if(frequency[c-'a'] == 0) return false;
            frequency[c-'a']--;
        }
        return true;
    }
}