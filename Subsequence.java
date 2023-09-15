class Subsequence {
    //Is Subsequence
    //Input: s = "abc", t = "ahbgdc"
    //Output: true
    //TC:O(n), SC:O(1)
    public boolean isSubsequence(String s, String t) {
        int p1 = 0, p2 = 0;
        while(p1<s.length() && p2<t.length()) {
            if(s.charAt(p1)==t.charAt(p2)) {
                p1++;
                p2++;
            } else {
                p2++;
            }
        }
        return s.length() == p1;
    }
}