//Self Dividing Numbers
//TC:O(nlogn), SC:O(n)
//Input: left = 1, right = 22
//Output: [1,2,3,4,5,6,7,8,9,11,12,15,22]
class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        int count = left;
        while(count<=right) {
            if(isDivisible(count)) list.add(count);
            count++;
        }
        return list;
    }
    public boolean isDivisible(int n) {
        int temp = n;
        while(n>0) {
            int rem = n%10;
            if(rem==0 || temp%rem != 0) return false;
            n = n/10;
        }
        return true;
    }
}