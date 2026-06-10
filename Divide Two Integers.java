class Solution {
    public int divide(int dividend, int divisor) {

        if (dividend == divisor)
            return 1;

        boolean sign = !((dividend < 0) ^ (divisor < 0));

        long n = Math.abs((long) dividend);
        long m = Math.abs((long) divisor);

        long quotient = 0;

        while (n >= m) {
            int count = 0;

            while (n >= (m << (count + 1))) {
                count++;
            }

            quotient += (1L << count);
            n -= (m << count);
        }

        if (quotient == (1L << 31)) {
            return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        }

        return sign ? (int) quotient : (int) (-quotient);
    }
}