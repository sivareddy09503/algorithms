//Account Balance after rounded purchase
//TC:O(1),SC:O(1)
//Input: purchaseAmount = 9
//Output: 90
class Solution {
    public int accountBalanceAfterPurchase(int purchaseAmount) {
        if(purchaseAmount%10==0) {
            return 100-purchaseAmount;
        }
        int result = 100-purchaseAmount;
        return purchaseAmount%10>=5 ? (result/10)*10:((result/10)+1)*10;
    }
}