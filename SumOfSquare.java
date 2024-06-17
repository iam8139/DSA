class SumOfSquare {
    public boolean judgeSquareSum(int c) {
        for (long i = 0; i*i <= c; i++) {
            double b = Math.sqrt(c-(int)i*i);
            // int b = c - (int)(i*i);
            // if (isPerfectSquare(0, b, b)) return true;
            if (b == (int)b) return true;
        }
        return false;
    }

    public boolean isPerfectSquare(long s, long e, int n) {
        if (s > e) return false;
        long mid = s + (e-s)/2;
        if (mid*mid == n) return true;
        if (mid*mid > n) return isPerfectSquare(s, mid-1, n);
        return isPerfectSquare(mid+1, e, n);
    }
}
