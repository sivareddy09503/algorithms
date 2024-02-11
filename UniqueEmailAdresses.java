//unique-email-addresses
//TC:O(n), SC:O(n)
/*Input: emails = ["test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"]
Output: 2
Explanation: "testemail@leetcode.com" and "testemail@lee.tcode.com" actually receive mails.*/
class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        int count = 0;
        for(String email:emails) {
            int atIndex = email.indexOf("@");
            int plusIndex = email.indexOf("+");
            String str1 = "";
            if(plusIndex>=0) str1 = email.substring(0,plusIndex);
            else str1 = email.substring(0,atIndex);
            str1 = str1.replace(".","")+email.substring(atIndex);
            if(set.add(str1)) count++;
        }
        return count;
    }
}