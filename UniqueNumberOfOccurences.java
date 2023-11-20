//Unique number of Occurences
//TC:O(1), SC:O(1)
/*Input: arr = [1,2,2,1,1,3]
Output: true
Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.*/
class Solution {
    int offset = 1000;
    public boolean uniqueOccurrences(int[] arr) {
        int[] freq = new int[2001];
        for(int a:arr) {
            freq[a+offset]++;
        }
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<2001;i++) {
            if(freq[i]==0) continue;
            if(set.contains(freq[i])) return false;
            set.add(freq[i]);
        }
        return true;
    }
}