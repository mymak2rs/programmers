class Solution {
    public int solution(int n, int k) {
        k -= (n/10);
        n*=12000;
        k*=2000;
        
        return n+k;
    }
}