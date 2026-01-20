import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
        // 우선 정렬 [0, 1, 3, 5, 6]
        Arrays.sort(citations);
        
        int n = citations.length;
        
        for(int i = 0; i < n; i++) {
            int h = n - i; // 전체 길이 - 현재 인덱스
            
            // 현재 논문의 인용 횟수(citations[i])가 그 뒤에 남은 논문 편수(h)보다 크거나 같다면
            // 그 h값이 우리가 찾는 h-index 후보
            if(citations[i] >= h) {
                return h;
            }
        }
        
        return 0;
    }
}