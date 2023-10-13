//Add Binary
//TC:O(n), SC:O(1)
//Input: a = "11", b = "1"
//Output: "100"
class Solution {
    public String addBinary(String a, String b) {
        int alen = a.length()-1;
        int blen = b.length()-1;
        StringBuilder sb = new StringBuilder();
        int na,nb;
        int carry = 0;
        while(alen>=0 || blen>=0||carry!=0) {
            na = alen >= 0 ? a.charAt(alen)-'0':0;
            nb = blen >= 0 ? b.charAt(blen)-'0':0;
            sb.append(na ^ nb ^ carry);
            carry = (na & nb) | (na & carry) | (nb & carry);
            alen--;
            blen--;
        }
        return sb.reverse().toString();
    }
}