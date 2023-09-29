//Splitting a String Into Descending Consecutive Values
//TC:O(2^n), SC:O(n)
//Input: s = "050043"
//Output: true
class Solution {
    public boolean splitString(String s) {
        return dfs(new ArrayList<>(), s, 0);
    }
    public boolean dfs(List<Long> list, String s, int start) {
        if(start == s.length()) {
            return list.size() >= 2;
        }
        long num = 0;
        for(int i=start; i<s.length();i++) {
            num = num * 10 + s.charAt(i)-'0';
            if(list.size()==0 || (list.get(list.size()-1))-num==1) {
                list.add(num);
                if(dfs(list,s,i+1)) return true;
                list.remove(list.size()-1);
            }
        }
        return false;
    }
}