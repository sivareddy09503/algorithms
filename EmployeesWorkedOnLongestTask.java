//The employee that worked on the longest task
//TC:O(n), SC:O(1)
/*Task 0 started at 0 and ended at 3 with 3 units of times.
Task 1 started at 3 and ended at 5 with 2 units of times.
Task 2 started at 5 and ended at 9 with 4 units of times.
Task 3 started at 9 and ended at 15 with 6 units of times.
The task with the longest time is task 3 and the employee with id 1 is the one that worked on it, so we return 1*/
class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int max = logs[0][1], id = logs[0][0];
        for(int i=1;i<logs.length;i++) {
            int time_req = logs[i][1]-logs[i-1][1];
            if(time_req>=max) {
                if(time_req==max) {
                    id = Math.min(id,logs[i][0]);
                }
                else {
                    max = time_req;
                    id = logs[i][0];
                }
            }
        }
        return id;
    }
}