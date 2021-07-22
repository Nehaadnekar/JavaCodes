class Solution {
    public int mySqrt(int x) {
        long l = 0, r = x, res = 0;

        while (r>=l) {
            long mid = l + (r - l) / 2;
            long sqMid = mid * mid;

            if (sqMid == x)
                return ((int) mid);
            if (sqMid > x) {
                r = mid - 1;
            } else {
                l = mid + 1;
                res = mid;
            }
        }
        return ((int)res);
    }
}
