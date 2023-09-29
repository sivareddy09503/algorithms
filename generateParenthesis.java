//Generate Parentheses
//TC:O(2^n), SC: O(n)
//Input: n = 3
//Output: ["((()))","(()())","(())()","()(())","()()()"]
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        dfs(list,n,"",0,0);
        return list;
    }
    public static void dfs(List<String> list, int max, String s, int open, int close) {
        if(max*2 == s.length()) {
            list.add(s);
            return;
        }
        if(open<max) {
            dfs(list, max, s+"(", open+1, close);
        }
        if(close<open) {
            dfs(list, max, s+")",open,close+1);
        }

    }
}