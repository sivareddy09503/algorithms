//Largest Odd Number in string
//TC:O(n),SC:O(1)
//Input: num = "52"
//Output: "5"
class Solution {
    public String largestOddNumber(String num) {
        for(int i=num.length()-1;i>-1;i--) {
            if(num.charAt(i)%2 == 1) return num.substring(0,i+1);
        }
        return "";
    }
}