import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        // 1. 결과 담을 배열 생성 (명령어 개수만큼)
        int[] answer = new int[commands.length];
        
        // 2. 각 명령 commands 하나씩 처리
        for(int i = 0; i < commands.length; i++) {
            int start = commands[i][0]; // 시작 인덱스 - 문제에선 1부터 시작함
            int end = commands[i][1];
            int k = commands[i][2];
            
            // 3. 배열 자르기
            // Arrays.copyOfRange(원본, 시작인덱스, 끝인덱스)를 사용
            // 인덱스는 0부터 시작하므로 'start - 1'
            // copyOfRange의 마지막 인덱스는 '포함되지 않음'이므로 end를 그대로
            
            // Arrays.copyOfRange(array, from, to):
            // array의 from 인덱스부터 to 인덱스 전까지를 복사하여 새로운 배열을 만듭니다.
            // 예: copyOfRange(arr, 1, 4) → 인덱스 1, 2, 3을 가져옴.
            int[] tmp = Arrays.copyOfRange(array, start - 1, end);
            
            // 4. 오름차순 정렬
            // 내림차순일 때 k번째는? 뒤에서 k번째와 같음
            // 우선 오름차순 정렬 하고 -> answer[i] = tmp[tmp.length - 1];
            Arrays.sort(tmp);
            
            // 5. k번째 수를 결과 배열에 담기
            answer[i] = tmp[k -1];
        
        } 
        return answer;
    }
}