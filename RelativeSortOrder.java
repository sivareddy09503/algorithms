//Relative sort array
//TC:O(n^2),SC:O(n)
//Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
//Output: [2,2,2,1,4,3,3,9,6,7,19]
class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Map<Integer,Integer> map = new TreeMap<>();
        for(Integer i:arr1) {
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int count = 0;
        for(Integer i:arr2) {
            for(int j=0;j<map.get(i);j++){
                arr1[count++]=i;
            }
            map.remove(i);
        }
        for(Integer i:map.keySet()){
            for(int j=0;j<map.get(i);j++) {
                arr1[count++]=i;
            }
        }
        return arr1;
    }
}