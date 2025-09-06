class Solution {
    public String solution(String my_string) {
        
        int n = my_string.length();
//         String answer = "";
        
//         for(int i = n - 1; i >= 0; i--) {
//             answer += my_string.charAt(i);
//         }
        
//         return answer;
        
        // StringBuilder sb = new StringBuilder();
        
//         for(int i = n - 1; i >= 0; i--) {
//             sb.append(my_string.charAt(i));
//         }
        
//         return sb.toString(); // 반환할 때는 toString() 으로 String 변환 필요
        
        return new StringBuilder(my_string).reverse().toString();
         
    }
}