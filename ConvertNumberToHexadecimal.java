//Convert a number to hexadecimal
//TC:O(n), SC:O(1)
/*Input: num = 26
Output: "1a"*/
class Solution {
    public String toHex(int num) {
        long num1 = num;
        if(num1 == 0) return "0";
        if(num1<0) num1 = (long)Math.pow(2,32) + num1;
        char[] map = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
        StringBuilder sb = new StringBuilder();
        while(num1>0) {
            sb.append(map[(int)Math.abs(num1%16)]);
            num1 = (long)Math.floor(num1/16);
        }
        return sb.reverse().toString();
    }
}