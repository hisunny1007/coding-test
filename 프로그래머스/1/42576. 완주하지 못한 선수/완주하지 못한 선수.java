import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // participant 0 - completion X
        
        // 1. 모든 참가자 명단 
        Map<String, Integer> map = new HashMap<>();
        
        // 참가자를 key로, value는 1
        for(String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }
        
        // completion 참가자 key, value는 0으로
        for(String c : completion) {
            map.put(c, map.get(c) - 1);
        }
        
        // map에서 value가 1인게 정답임
        for(String key : map.keySet()) {
            if(map.get(key) == 1) {
                return key;
            }
        }
        return "";
        
    }
}