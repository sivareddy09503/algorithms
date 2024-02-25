//element-appearing-more-than-25-in-sorted-array
//TC:O(n),SC:O(1)
/*Input: arr = [1,2,2,6,6,6,6,7,10]
Output: 6*/
class Solution {
    public int findSpecialInteger(int[] arr) {
        int qtr = arr.length/4;
        int res = 0;
        int p=arr[0];
        int count =1;
        for(int i=1;i<arr.length;i++) {
            if(p==arr[i]) count++;
            else count =1;
            if(count>qtr) return arr[i];
            p=arr[i];
        }
        return p;
    }
}