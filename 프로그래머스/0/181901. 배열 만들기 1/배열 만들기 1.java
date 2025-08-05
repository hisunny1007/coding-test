class Solution {
    public int[] solution(int n, int k) {
    
        int count = n / k; // k배수 개수
        
        int[] answer = new int[count];
        // answer = [0, 0, 0]
        
        for(int i = 1; i <= count; i++) {
             answer[i-1] = i * k;
        }
             
        return answer;
    }
}