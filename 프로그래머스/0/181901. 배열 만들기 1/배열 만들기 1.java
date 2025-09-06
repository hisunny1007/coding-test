class Solution {
    public int[] solution(int n, int k) {
        int len = n / k;
        int[] answer = new int[len];
        
        int index = 0;
        for(int i = k; i <= n; i += k) {
            answer[index] = i; 
            index++;
        }
        
        return answer;
    }
}