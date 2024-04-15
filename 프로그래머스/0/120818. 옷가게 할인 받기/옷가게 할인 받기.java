class Solution {
    public int solution(int price) {
        int answer = price;
        
        if(price >= 500000){
            answer *= 0.8;
            return answer;
        }
        else if(price >= 300000){
            answer *= 0.9;
            return answer;
        }
        else if(price >= 100000){
            answer *= 0.95;
            return answer;
        }
        else{
            return answer;
        }
    }
}