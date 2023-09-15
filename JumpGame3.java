class JumpGame3 {
    //Jump Game III
    //Input: arr = [4,2,3,0,3,1,2], start = 5
    //Output: true
/*Explanation: 
All possible ways to reach at index 3 with value 0 are: 
index 5 -> index 4 -> index 1 -> index 3 
index 5 -> index 6 -> index 4 -> index 1 -> index 3*/
    //TC:O(n), SC:O(n)
    public boolean canReach(int[] arr, int start) {
        if(start<0 || start>arr.length-1 || arr[start]<0) return false;
        if(arr[start] == 0) return true;
        arr[start] = -1 * arr[start];
        boolean left = canReach(arr, start-arr[start]);
        boolean right = canReach(arr, start+arr[start]);
        return left || right;
    }
}