//Check if number is fascinating
//TC:O(n), SC:O(n)
//Input: n = 192
//Output: true
class Solution {
    public boolean isFascinating(int n) {
        Set<Integer> set = new HashSet<>();
        int num1 = n*2, num2 = n*3;
        while(n>0) {
            int rem = n%10;
            int rem1 = num1%10;
            int rem2 = num2%10;
            set.add(rem);
            set.add(rem1);
            set.add(rem2);
            n = n/10;
            num1 = num1/10;
            num2 = num2/10;
        }
        for(int i=1;i<=9;i++) {
            if(!set.contains(i)) return false;
        }
        return true;
    }
}