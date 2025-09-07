import java.util.*;

class Solution {
    public int[] solution(int n) {
        
        // 홀수 개수 알아야 함
        int size = (n + 1) / 2;
        
        int[] answer = new int[size];
        
        int index = 0;
        // for(int i = 1; i <= n; i++) {
        //     if(i % 2 != 0) {
        //         answer[index++] = i;
        //     }
        // }
        for(int i = 1; i <= n; i+=2) {
            answer[index++] = i;
        }
        
        return answer;
    }
}