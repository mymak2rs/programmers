class Solution {
    public int solution(int n) {
        int gcd = gcd(n, 6);
        int lcm = (n * 6) / gcd;
        int answer = lcm / 6;
        return answer;
    }
    
    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
