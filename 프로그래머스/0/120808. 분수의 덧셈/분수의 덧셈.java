class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1;
        int denom = denom1 * denom2;

        // 최대공약수 구하기
        int gcd = gcd(numer, denom);

        numer /= gcd;
        denom /= gcd;

        return new int[]{numer, denom};
    }

    // 최대공약수 계산
    public int gcd(int a, int b) {
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}