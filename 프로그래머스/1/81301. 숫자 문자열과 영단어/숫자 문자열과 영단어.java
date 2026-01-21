class Solution {
    public int solution(String s) {
        
        String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        
        for(int i = 0; i < 10; i++) {
            s = s.replaceAll(words[i], String.valueOf(i)); // (대상, 바꿀 것) // 숫자 i를 문자 i로 바꿈
        }
        
        return Integer.parseInt(s);
    }
}