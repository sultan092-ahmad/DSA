class Solution {
    public int change(int amount, int[] coins) {
        int[] sf = new int[amount + 1];
        sf[0] = 1;
        for (int coin : coins) {
            for (int i = coin; i <= amount; i++) {
                sf[i] = sf[i] + sf[i - coin];
            }
        }
        return sf[amount];
    }
}