//Count largest group
//TC:O(n), SC:O(1)
/*Input: n = 13
Output: 4
Explanation: There are 9 groups in total, they are grouped according sum of its digits of numbers from 1 to 13:
[1,10], [2,11], [3,12], [4,13], [5], [6], [7], [8], [9].
There are 4 groups with largest size*/
class Solution {
    public int countLargestGroup(int n) {
        List<Integer> list = new ArrayList(Collections.nCopies(37,0));
        for(int i=1;i<=n;i++) {
            int cd = countDigits(i);
            list.set(cd, list.get(cd)+1);
        }
        return Collections.frequency(list, Collections.max(list));
    }
    public int countDigits(int n) {
        if(n==0) return 0;
        return n%10 + countDigits(n/10);
    }
}