//Add strings
//TC:O(n), SC:O(1)
//Input: num1 = "11", num2 = "123"
//Output: "134"
class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int i=num1.length()-1,j=num2.length()-1,carry = 0, sum;
        while(i>=0 || j>=0 || carry>0) {
            int x = (i>=0) ? num1.charAt(i--)-'0' : 0;
            int y = (j>=0) ? num2.charAt(j--)-'0' : 0;
            sum = x+y+carry;
            sb.append(sum%10);
            carry = sum/10;
        }
        return sb.reverse().toString();
    }
}