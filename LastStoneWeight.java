//Last stone weight
//TC:O(nlogn), SC:O(1)
/*Input: stones = [2,7,4,1,8,1]
Output: 1
Explanation: 
We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone*/
class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<stones.length;i++) {
            list.add(stones[i]);
        }
        while(true) {
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int len = list.size();
            if (len == 1 || len == 0)
			{
				break;
			}
            Collections.sort(list);
            min = list.get(len-2);
            max = list.get(len-1);
            if(max>min) {
                max = max -min;
                list.remove(list.size()-1);
                list.remove(list.size()-1);
                list.add(max);
            }
            else if(max == min) {
                list.remove(list.size()-1);
                list.remove(list.size()-1);
            }
        }
        if(list.size()==1) return list.get(0);
        return 0;
    }
}