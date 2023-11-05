//check if N and its Double exist
//TC:O(n), SC:O(n)
//Input: arr = [10,2,5,3]
//Output: true
class Solution {
    public boolean checkIfExist(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            map.put(arr[i],i);
        }
        for(int i=0;i<arr.length;i++) {
            if(map.containsKey(arr[i]*2) && map.get(2*arr[i])!=i) return true;
        }
        return false;
    }
}