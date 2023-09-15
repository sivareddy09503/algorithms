class MoveZeroes {
    //Move Zeroes
    //Input: nums = [0,1,0,3,12]
    //Output: [1,3,12,0,0]
    //TC:O(n), SC:O(n)
    public void moveZeroes(int[] nums) {
        if(nums.length==1) return;
        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0) {
                queue.add(nums[i]);
            }
        }
        int index = 0;
        while(queue.size()!=0){
            nums[index] = queue.poll();
            index++;
        }
        for(int i=index;i<nums.length;i++) {
            nums[i] = 0;
        }
    }
}