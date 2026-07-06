class Solution {
    public int accountBalanceAfterPurchase(int rs) {
        return 100 - (int)(Math.round(rs/10.0)*10);
    }
}