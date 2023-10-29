//Maximum difference by remapping a digit
//TC:O(n), SC:O(1)
//Input: num = 11891
//Output: 99009(99899-890)
class Solution {
    public int minMaxDifference(int num) {
        String val = String.valueOf(num);
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(char c:val.toCharArray()){
            for(int i=0;i<=9;i++){
                String n = val.replaceAll(c+"", i+"");
                max = Math.max(max, Integer.parseInt(n));
                min = Math.min(min, Integer.parseInt(n));
            }
        }
        return max-min;
    }
}