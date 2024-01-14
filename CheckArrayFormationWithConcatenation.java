//Check array formation from concatenation
//TC:O(n), SC:O(n)
/*Input: arr = [15,88], pieces = [[88],[15]]
Output: true
Explanation: Concatenate [15] then [88]*/
class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        HashMap<Integer,int[]> map = new HashMap<>();
        for(int[] list:pieces)
            map.put(list[0],list);
        int index = 0;
        while(index<arr.length) {
            if(!map.containsKey(arr[index]))
                return false;
            int[] list = map.get(arr[index]);
            for(int val:list) {
                if(index>=arr.length || val!=arr[index])
                    return false;
                index++;
            }
        }
        return true;
    }
}