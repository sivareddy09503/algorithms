class JumpGame1 {
    //Jump Game
    //Input: nums = [2,3,1,1,4]
    //Output: true
    //TC:O(n), SC:O(1)
    public boolean canJump(int[] nums) {
        int reachable = 0;
        for(int i=0; i<nums.length && i<=reachable;i++) {
            reachable = Math.max(reachable, nums[i]+i);
            if(reachable>=nums.length-1) 
                return true;
        }
        return false;
    }
}