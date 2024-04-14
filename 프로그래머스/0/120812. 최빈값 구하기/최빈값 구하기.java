import java.util.*;

class Solution {
    public int solution(int[] array) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        
        // 각 숫자의 빈도를 계산합니다
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxFrequency = 0;
        for (int count : frequencyMap.values()) {
            if (count > maxFrequency) {
                maxFrequency = count;
            }
        }
        
        int mode = 0;
        int modeCount = 0;
        
        // 최대 빈도를 가진 숫자가 몇 개인지 확인합니다
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                mode = entry.getKey();
                modeCount++;
            }
        }
        
        // 최빈값이 둘 이상이면 -1을 반환합니다
        if (modeCount > 1) {
            return -1;
        }
        
        // 최빈값을 반환합니다
        return mode;
    }
}
