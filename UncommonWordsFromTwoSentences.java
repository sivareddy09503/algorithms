//Uncommon words among two sentences
//TC:O(n), SC:O(n)
/*Input: s1 = "this apple is sweet", s2 = "this apple is sour"
Output: ["sweet","sour"]*/
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] strArr = s1.split(" ");
        String[] strArr1 = s2.split(" ");
        int n1 = strArr.length, n2 = strArr1.length;
        HashMap<String, Integer> hp1 = new HashMap<>();
        HashMap<String, Integer> hp2 = new HashMap<>();
        for(int i=0;i<n1;i++) {
            hp1.put(strArr[i], hp1.getOrDefault(strArr[i],0)+1);
        }
        for(int i=0;i<n2;i++) {
            hp1.put(strArr1[i], hp1.getOrDefault(strArr1[i],0)+1);
        }
        Set<String> set = new HashSet<>();
        for(String a:hp1.keySet()) {
            if(hp1.get(a)==1) {
                if(!hp2.containsKey(a)) set.add(a);
            }
        }
        for(String a:hp2.keySet()) {
            if(hp2.get(a)==1) {
                if(!hp1.containsKey(a)) set.add(a);
            }
        }
        String[] ans = new String[set.size()];
        int idx = 0;
        for(String a:set) {
            ans[idx++] = a;
        }
        return ans;
    }
}