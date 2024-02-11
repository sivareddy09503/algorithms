//Calculate amount paid in tax
//TC:O(n), SC:O(1)
/*Input: brackets = [[3,50],[7,10],[12,25]], income = 10
Output: 2.65000
Explanation:
Based on your income, you have 3 dollars in the 1st tax bracket, 4 dollars in the 2nd tax bracket, and 3 dollars in the 3rd tax bracket.
The tax rate for the three tax brackets is 50%, 10%, and 25%, respectively.
In total, you pay $3 * 50% + $4 * 10% + $3 * 25% = $2.65 in taxes*/
class Solution {
    public double calculateTax(int[][] brackets, int income) {
        double tax = 0;
        int prev = 0;
        for(int[] bracket:brackets) {
            int upper = bracket[0], percent = bracket[1];
            if(income>=upper) {
                tax += (upper-prev) * percent/ 100d;
                prev = upper;
            } else {
                tax += (income-prev) * percent/100d;
                return tax;
            }
        }
        return tax;
    }
}