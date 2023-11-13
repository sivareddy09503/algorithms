//Find N Unique Integers Sum upto Zero
//TC:O(n), SC:O(n)
//Input: n = 5
//Output: [-7,-1,1,3,4]
class Solution {
    public int[] sumZero(int n) {
        int[] result = new int[n];
        int count = n, sum = 0;
         if(n==1) {
            result[0] =0;
        } else if(n==2) {
            result[0] =1;
            result[1] =-1;
        } else {
        for(int i=0;i<n;i++) {
            if(count%2!=0) {
                result[i] = 0;
                count--;
            }
            if(count%2 == 0 && i<n-1) {
                result[i] = i;
                sum +=i;
            } else {
                result[i] = -sum;
            }
        }
        }
        return result;
    }
}