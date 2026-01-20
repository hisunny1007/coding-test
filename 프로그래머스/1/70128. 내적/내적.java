class Solution {
    public int solution(int[] a, int[] b) {
        
        int answer = 0;
        // 길이가 같은 두 배열
        for(int i = 0; i < a.length; i++) {
            answer += a[i] * b[i];
        }
        return answer;
    }
}