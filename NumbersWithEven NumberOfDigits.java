//Find numbers with even number of digits
//TC:O(n), SC:O(n)
/*12 contains 2 digits (even number of digits). 
345 contains 3 digits (odd number of digits). 
2 contains 1 digit (odd number of digits). 
6 contains 1 digit (odd number of digits). 
7896 contains 4 digits (even number of digits). 
Therefore only 12 and 7896 contain an even number of digits*/
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            if(isEven(nums[i])) {
                count++;
            }
        }
        return count;
    }
    public boolean isEven(int num) {
        int count = 0;
        while(num>0) {
            num = num/10;
            count++;
        }
        return (count%2==0);
    }
}