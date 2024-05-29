class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n); // long 형을 문자열로 변환
        
        int[] answer = new int[str.length()];
        
        int count = 0; // 숫자를 뒤집어 저장할 때 사용할 인덱스
        
        for (int i = str.length() - 1; i >= 0; i--) {
            answer[count++] = str.charAt(i) - '0'; // char에서 '0'을 빼서 실제 숫자로 변환
        }

        return answer;
    }
}