import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= n; i++) {
            if ( i % 2 != 0) {
                list.add(i);
            }
        }
        // return list; List<Integer> cannot be converted to int[]
        
        // ArrayList를 int[] 로 변환
        int[] answer = new int[list.size()];
        
        for(int i = 0; i < list.size(); i ++) {
            answer[i] = list.get(i);
        }
        
        return answer;
        
    }
}