//lemonade-change
//TC:O(n), SC:O(1)
/*Input: bills = [5,5,5,10,20]
Output: true
Explanation: 
From the first 3 customers, we collect three $5 bills in order.
From the fourth customer, we collect a $10 bill and give back a $5.
From the fifth customer, we give a $10 bill and a $5 bill.
Since all customers got correct change, we output true.*/
class Solution {
    public boolean lemonadeChange(int[] bills) {
        int fives = 0, tens = 0;
        for(int bill:bills) {
            if(bill==5) {
                fives++;
            } else if(bill==10) {
                if(fives==0) return false;
                fives--;
                tens++;
            } else {
                if(fives>0 && tens>0) {
                    fives--;
                    tens--;
                } else if(fives>=3) {
                    fives -=3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}