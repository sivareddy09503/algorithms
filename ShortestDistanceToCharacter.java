//Shortest distance to a character
//TC:O(n), SC:O(1)
//Input: s = "loveleetcode", c = "e"
//Output: [3,2,1,0,1,0,0,1,2,2,1,0]
class Solution {
    public int[] shortestToChar(String s, char c) {
        StringBuilder str = new StringBuilder(s);
        int[] ans = new int[str.length()];
        for(int i=0;i<str.length();i++) {
            if(c==str.charAt(i)) {
                ans[i] = 0;
                continue;
            }
            String s1 = str.substring(0,i);
            String s2 = str.substring(i+1);
            int a = s1.lastIndexOf(c);
            int b = s2.indexOf(c);
            if(a==-1) a=Integer.MAX_VALUE;
            else a = s1.length()-a;

            if(b==-1) b=Integer.MAX_VALUE;
            else b = b+1;

            ans[i] = Math.min(a,b);
        }
        return ans;
    }
}