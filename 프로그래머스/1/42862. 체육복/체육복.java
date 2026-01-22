import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        // 우선 확보된 체육수업학생
        int answer = n - lost.length;
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 제한사항 잘 읽자
        // 여벌 체육복 가져온 사람이 도난당했을 수도 있음
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if(reserve[j] ==lost[i]) {
                    answer++;
                    // 무의미한 값으로 대입하여 카운팅처리x, break
                    lost[i] = -1;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        for(int i = 0; i < lost.length; i++) {
            for(int j = 0; j < reserve.length; j++) {
                if((lost[i]-1==reserve[j]) || (lost[i]+1 == reserve[j])) {
                    answer++;
                    reserve[j] = -1;
                    break;
                }
            }
        }
        return answer;
    }
}