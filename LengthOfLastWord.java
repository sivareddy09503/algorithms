class LengthOfLastWord {
    //length of last word
    //Input: s = "Hello World"
    //Output: 5
    //TC:O(n), SC:O(1)
    public int lengthOfLastWord(String s) {
        int right = s.length() - 1;
        while(right>=0 && s.charAt(right) == ' ') {
            right--;
        }
        int left = right;
        while(left>=0 && s.charAt(left) != ' ') {
            left--;
        }
        return right - left;
       /* int length = 0;
        int count = 0;
        for(int i=s.length()-1; i>=0;i--) {
            if(s.charAt(i) == ' ') {
                count++;
            } else {
                break;
            }
        }
        s = s.substring(0,s.length()-count);
        for(int i=s.length()-1; i>=0;i--) {
            if(s.charAt(i) != ' ') {
                length++;
            } else {
                break;
            }
        }
        return length;*/
    }
}