//Slowest key
//TC:O(n), SC:O(1)
//Input: releaseTimes = [9,29,49,50], keysPressed = "cbcd"
//Output: "c"
class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        int min = releaseTimes[0];
        char c = keysPressed.charAt(0);
        for(int i=1;i<keysPressed.length();i++) {
            int relsTime = releaseTimes[i]-releaseTimes[i-1];
            if(relsTime==min && keysPressed.charAt(i)>c) {
                c = keysPressed.charAt(i);
            } else if (relsTime>min) {
                min = relsTime;
                c = keysPressed.charAt(i);
            }
        }
        return c;
    }
}