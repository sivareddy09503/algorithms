//first bad version
//TC:O(logn),SC:O(1)
/*Input: n = 5, bad = 4
Output: 4
Explanation:
call isBadVersion(3) -> false
call isBadVersion(5) -> true
call isBadVersion(4) -> true
Then 4 is the first bad version.*/
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        while(low<=high) {
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)) {
                high = mid-1;
            } else {
                low = mid+1;
            }
        }
        return low;
    }
}