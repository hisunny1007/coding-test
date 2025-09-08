import java.util.*;

class Solution {
    public int[] solution(int[] numbers, int num1, int num2) {
        
        int[] answer = new int[num2 - num1 + 1];
        
        int idx = 0;
        for(int i = num1; i <= num2; i++) {
            answer[idx++] = numbers[i];
        }
        
        return answer;
        // num1번째 인덱스부터 num2번째 인덱스까지 잘라서 반환
        // return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}