class Solution {
    public long[] solution(int a, int b) {
        long[] answer = new long[b];
		long t = a;
		for(int i = 0; i<answer.length;i++) {
			answer[i] = t;
			t += a;
		}
        return answer;
    }
}