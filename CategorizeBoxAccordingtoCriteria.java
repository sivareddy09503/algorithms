//Categorize Box According to Criteria
//TC:O(1),SC:O(1)
//Input: length = 1000, width = 35, height = 700, mass = 300
//Output: "Heavy"
class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume = (long)length*width*height;
        if((length>=10000 || width>=10000 || height>=10000 || mass>=10000 || (volume)>=Math.pow(10,9)) && mass>=100) {
            return "Both";
        }

        if(length>=10000 || width>=10000 || height>=10000 || mass>=10000 || length*width*height>=Math.pow(10,9)) {
            return "Bulky";
        }

        if(mass>=100) {
            return "Heavy";
        }
        return "Neither";
    }
}