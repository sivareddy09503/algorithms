//Restore IP Addresses
//TC:O(1), SC:O(1)
//Input: s = "25525511135"
//Output: ["255.255.11.135","255.255.111.35"]
class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> list = new ArrayList<>();
        dfs(list,s,"",0,0);
        return list;
    }
    public static void dfs(List<String> list, String str, String path, int seg, int start) {
        if(seg==4) {
            if(start == str.length()) {
                list.add(path.substring(0,path.length()-1));
            }
            return;
        }
        for(int i=start; i<str.length() && i<start+3;i++) {
            String curr = str.substring(start,i+1);
            if(isValid(curr)) {
                dfs(list,str,path+curr+".",seg+1,i+1);
            }
        }
    }

    public static boolean isValid(String str) {
        if(str.length()>3 || (str.charAt(0) == '0' && str.length()>1) || str.isEmpty() || Integer.parseInt(str)>255) {
            return false;
        }
        return true;
    }
}