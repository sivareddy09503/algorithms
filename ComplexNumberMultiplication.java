//Complex number multiplication
//TC:O(1), SC:O(1)
//Input: num1 = "1+1i", num2 = "1+1i"
//Output: "0+2i"
class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        int real1 = Integer.parseInt(num1.substring(0,num1.indexOf('+')));
        int img1 = Integer.parseInt(num1.substring(num1.indexOf('+')+1,num1.length()-1));
        int real2 = Integer.parseInt(num2.substring(0,num2.indexOf('+')));
        int img2 = Integer.parseInt(num2.substring(num2.indexOf('+')+1,num2.length()-1));

        int real = real1*real2 - img1 *img2;
        int img = real1*img2 + real2*img1;
        String result = real + "+" + img + "i";
        return result;
    }
}