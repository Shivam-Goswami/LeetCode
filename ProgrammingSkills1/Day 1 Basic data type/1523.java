class Solution {
    public int countOdds(int low, int high) {
        int odd = (high - low) / 2;
        return (low % 2 == 0 && high % 2 == 0) ? odd : odd + 1;
    }
}