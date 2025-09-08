class Solution {
    public int solution(int n) {
        
        
        // 올림을 해준다..
        // return (int) Math.ceil((double)n/7);  
        
        int answer = n / 7;
        if(n % 7 != 0) {
            answer++;
            
        }
        return answer;
    }
}