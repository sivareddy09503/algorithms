//Rank transform of an array
//TC:O(n), SC:O(n)
/*Input: arr = [40,10,20,30]
Output: [4,1,2,3]
Explanation: 40 is the largest element. 10 is the smallest. 20 is the second smallest. 30 is the third smallest*/
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int[] array = Arrays.copyOf(arr,arr.length);
        Arrays.sort(array);
        int k=1;
        for(int i=0;i<array.length;i++) {
            if(!map.containsKey(array[i]))
                map.put(array[i],k++);
        }
        int[] result = new int[array.length];
        for(int i=0;i<arr.length;i++) {
            result[i] = map.get(arr[i]);
        }
        return result;
    }
}