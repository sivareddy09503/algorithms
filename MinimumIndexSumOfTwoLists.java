//Minimum index sum of two lists
//TC:O(n), SC:O(n)
/*Input: list1 = ["Shogun","Tapioca Express","Burger King","KFC"], list2 = ["Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"]
Output: ["Shogun"]
Explanation: The only common string is "Shogun".*/
class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<list1.length;i++) {
            map.put(list1[i],i);
        }
        int min = Integer.MAX_VALUE;
        ArrayList<String> str = new ArrayList<>();
        for(int i=0;i<list2.length;i++) {
            if(map.containsKey(list2[i])) {
                int sum = map.get(list2[i])+i;
                if(sum<min) {
                    min = sum;
                    str.clear();
                    str.add(list2[i]);
                }
                else if(min == sum) {
                    str.add(list2[i]);
                }
            }
        }
        return str.toArray(new String[0]);
    }
}