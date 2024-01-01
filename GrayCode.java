//Gray code
//TC:O(n), SC:O(n)
/*Input: n = 2
Output: [0,1,3,2]
Explanation:
The binary representation of [0,1,3,2] is [00,01,11,10].
- 00 and 01 differ by one bit
- 01 and 11 differ by one bit
- 11 and 10 differ by one bit
- 10 and 00 differ by one bit
[0,2,3,1] is also a valid gray code sequence, whose binary representation is [00,10,11,01].
- 00 and 10 differ by one bit
- 10 and 11 differ by one bit
- 11 and 01 differ by one bit
- 01 and 00 differ by one bit*/
class Solution {
    public List<Integer> grayCode(int n) {
        List<String> greystr = solve(n);
        List<Integer> ans = new ArrayList<>();
        for(String s:greystr) {
            ans.add(Integer.parseInt(s,2));
        }
        return ans;
    }
    public List<String> solve(int n) {
        if(n==1) {
            List<String> base = new ArrayList<>();
            base.add("0");
            base.add("1");
            return base;
        }
        List<String> ans = new ArrayList<>();
        List<String> temp = solve(n-1);
        for(int i=0;i<temp.size();i++)
            ans.add("0"+temp.get(i));
        for(int i=temp.size()-1;i>=0;i--)
            ans.add("1"+temp.get(i));
        return ans;
    }
}