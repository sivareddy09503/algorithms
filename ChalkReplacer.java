//Find the student that will replace the chalk
//TC:O(n), SC:O(1)
/*Input: chalk = [5,1,5], k = 22
Output: 0
Explanation: The students go in turns as follows:
- Student number 0 uses 5 chalk, so k = 17.
- Student number 1 uses 1 chalk, so k = 16.
- Student number 2 uses 5 chalk, so k = 11.
- Student number 0 uses 5 chalk, so k = 6.
- Student number 1 uses 1 chalk, so k = 5.
- Student number 2 uses 5 chalk, so k = 0.
Student number 0 does not have enough chalk, so they will have to replace it*/
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int i=0;i<chalk.length;i++) {
            sum += chalk[i];
        }
        long rem =k%sum;
        for(int i=0;i<chalk.length;i++) {
            if(chalk[i]>rem) return i;
            rem -= chalk[i];
        }
        return 0;
    }
}