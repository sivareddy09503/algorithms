//baseball game
//TC:O(n), SC:O(n)
/*Input: ops = ["5","2","C","D","+"]
Output: 30
Explanation:
"5" - Add 5 to the record, record is now [5].
"2" - Add 2 to the record, record is now [5, 2].
"C" - Invalidate and remove the previous score, record is now [5].
"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
The total sum is 5 + 10 + 15 = 30.*/
class Solution {
    public int calPoints(String[] operations) {
        int output = 0;
        LinkedList<Integer> list = new LinkedList<>();
        for(int i=0,j=0;i<operations.length;i++){
            if(operations[i].equals("C")) {
                list.removeLast();
                j--;
            } else if(operations[i].equals("D")) {
                list.add(2*(list.getLast()));
                j++;
            } else if(operations[i].equals("+")) {
                list.add(list.getLast()+list.get(j-2));
                j++;
            } else {
                list.add(Integer.parseInt(operations[i]));
                j++;
            }
        }
        for(int n:list) {
            output += n;
        }
        return output;
    }
}