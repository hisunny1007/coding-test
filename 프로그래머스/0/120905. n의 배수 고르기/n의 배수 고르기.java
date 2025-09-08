class Solution {
    public int[] solution(int n, int[] numlist) {
        
        // n 배수만 따로 배열로 반환
        int cnt = 0;
        for(int num : numlist) {
            if(num % n == 0) {
                cnt++;
            }
        }
        
        int[] answer = new int[cnt];
        int idx = 0; // answer 배열의 인덱스
        for(int num : numlist) {
            if(num % n == 0) {
                // answer[idx] = num;
                // idx++;
                answer[idx++] = num;
            }
        }
        
        return answer;
        
        
    }
}