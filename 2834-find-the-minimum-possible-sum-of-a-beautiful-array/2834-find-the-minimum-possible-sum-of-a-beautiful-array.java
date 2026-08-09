class Solution {
    public int minimumPossibleSum(int n, int target) {

        long MOD = 1000000007L;

        long half = target / 2;

        if (n <= half) {
            long sum = (long)n * (n + 1) / 2;
            return (int)(sum % MOD);
        }

        long sum = half * (half + 1) / 2;

        long rem = n - half;

        sum += rem * target;
        sum += rem * (rem - 1) / 2;

        return (int)(sum % MOD);
    }
}