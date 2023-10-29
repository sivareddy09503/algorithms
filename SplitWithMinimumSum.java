//Split With Minimum Sum
//TC:O(n), SC:O(1)
//Input: num = 4325
//Output: 59 (24 +35)
class Solution {
    public int splitNum(int num) {
        String str = num+"";
        char[] chrArr = str.toCharArray();
        Arrays.sort(chrArr);
        String x1 = "", x2 = "";
        for(int i=0;i<chrArr.length;i++){
            if(i%2 == 0) {
                x1 +=chrArr[i];
            } else {
                x2 +=chrArr[i];
            }
        }
        return Integer.parseInt(x1) + Integer.parseInt(x2);
    }
}