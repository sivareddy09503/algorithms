//Find value of variable after performing operations
//TC:O(n),SC:O(1)
//Input: operations = ["--X","X++","X++"]
//Output: 1
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String str:operations) {
            x += str.equals("X++")||str.equals("++X")?1:-1;
        }
        return x;
    }
}