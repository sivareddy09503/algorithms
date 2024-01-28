//Finding 3 digit even numbers
//TC:O(n), SC:O(1)
/*Input: digits = [2,1,3,0]
Output: [102,120,130,132,210,230,302,310,312,320]
Explanation: All the possible integers that follow the requirements are in the output array. 
Notice that there are no odd integers or integers with leading zeros.*/
class Solution {
    public int[] findEvenNumbers(int[] digits) {
        int[] map = new int[10];
        for(int i=0;i<digits.length;i++) {
            map[digits[i]]++;
        }
        List<Integer> arr = new ArrayList<>();
        for(int i=100;i<=999;i=i+2) {
            int num = i;
            int[] freq = new int[10];
            while(num>0) {
                int rem = num %10;
                freq[rem]++;
                num = num/10;
            }
            boolean res = findans(freq,map);
            if(res) arr.add(i);
        }
        int[] ans = new int[arr.size()];
        for(int i=0;i<arr.size();i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }
    public boolean findans(int[] currentNum, int[] database) {
        for(int i=0;i<10;i++) {
            if(currentNum[i]>database[i]) return false;
        }
        return true;
    }
}