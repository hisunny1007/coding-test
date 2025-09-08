import java.util.*;

class Solution {
    public int solution(String[] s1, String[] s2) {
        
//         int answer = 0;
//         for(int i = 0; i < s1.length; i++) {
//             for(int j = 0; j < s2.length; j++) {
//                 if(s1[i].equals(s2[j])) {
//                     answer++;
//                 }
//             }
//         }
        
//         return answer;
        
        int answer = 0;
        for(String str : s1) {
            if(Arrays.asList(s2).contains(str)) {
                answer++;
            }
        }
        
        return answer;
            
    }
}