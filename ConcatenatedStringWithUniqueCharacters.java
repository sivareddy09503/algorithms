//Maximum Length of a Concatenated String with Unique Characters
//TC:O(2^n), SC:O(n)
//Input: arr = ["un","iq","ue"]
//Output: 4, uniq
class Solution {
    public int maxLength(List<String> arr) {
        return dfs(arr, "", 0);
    }
    public int dfs(List<String> arr, String str, int curr) {
        if(arr.size() == curr) {
            return str.length();
        }
        int left = 0, right = 0;
        String tmp = str + arr.get(curr);
        if(isValid(tmp)) {
           left = dfs(arr, tmp, curr+1);
        }
        right = dfs(arr, str, curr+1);
        return Math.max(left, right);
    }
    public boolean isValid(String str) {
        int[] arr = new int[26];
        for(int i=0; i<str.length();i++) {
            arr[str.charAt(i)-'a']++;
        }
        for(int i=0; i<arr.length;i++) {
            if(arr[i]>1) return false;
        }
        return true;
    }
}