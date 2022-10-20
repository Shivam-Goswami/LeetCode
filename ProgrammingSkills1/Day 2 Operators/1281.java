class Solution {
    public int subtractProductAndSum(int n) {
        int p = 1, sum = 0;
        while (n != 0) {
            int r = n % 10;
            sum = sum + r;
            p = p * r;
            n = n / 10;
        }
        return p - sum;
    }
}