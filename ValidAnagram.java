class ValidAnagram {
    //Valid Anagram
    //Input: s = "anagram", t = "nagaram"
    //Output: true
    //TC:O(n), SC: O(1)
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false;
        int[] counter = new int[26];
        for(int i=0; i<s.length();i++) {
            counter[s.charAt(i) - 'a']++;
            counter[t.charAt(i) - 'a']--;
        }
        for(int i=0; i<counter.length;i++) {
            if(counter[i] != 0)
                return false;
        }
        /*HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++) {
            if(map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i))+1);
            else
                map.put(s.charAt(i), 1);
            if(map.containsKey(t.charAt(i)))
                map.put(t.charAt(i), map.get(t.charAt(i))-1);
            else
                map.put(t.charAt(i), -1);
        }
        for(char k: map.keySet()) {
            if(map.get(k) != 0)
                return false;
        }*/
        return true;
    }
}