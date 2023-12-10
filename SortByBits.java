//Sort integers by the number of 1 bits
//TC:O(nlogn), SC:O(n)
/*Input: arr = [0,1,2,3,4,5,6,7,8]
Output: [0,1,2,4,8,3,5,6,7]
Explantion: [0] is the only integer with 0 bits.
[1,2,4,8] all have 1 bit.
[3,5,6] have 2 bits.
[7] has 3 bits.
The sorted array by bits is [0,1,2,4,8,3,5,6,7]*/
class Solution {
    public int[] sortByBits(int[] arr) {
        Integer[] boxedArray = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(boxedArray, (a,b) -> {
            int countA = Integer.bitCount(a);
            int countB = Integer.bitCount(b);
            return countA == countB ? a-b :countA-countB;
        });
        return Arrays.stream(boxedArray).mapToInt(Integer::intValue).toArray();
    }
}