//Binary watch
//TC:O(1),SC:O(1)
/*Input: turnedOn = 1
Output: ["0:01","0:02","0:04","0:08","0:16","0:32","1:00","2:00","4:00","8:00"]*/
class Solution {
    public List<String> readBinaryWatch(int turnedOn) {
        ArrayList<String> results = new ArrayList<>();
        for(int hour=0;hour<12;hour++) {
            for(int min=0;min<60;min++) {
                if(Integer.bitCount(hour)+Integer.bitCount(min)==turnedOn) {
                    if(min<10) {
                        results.add(String.format("%d:0%d",hour, min));
                    } else {
                        results.add(String.format("%d:%d",hour, min));
                    }
                }
            }
        }
        return results;
    }
}