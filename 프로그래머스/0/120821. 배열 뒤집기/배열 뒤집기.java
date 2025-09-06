// class Solution {
//     public int[] solution(int[] num_list) {
        
//         int len = num_list.length;
//         int[] answer = new int[len];
        
//         for(int i = 0; i < len; i++) {
//             answer[i] = num_list[len - 1 - i];
//         }
        
//         return answer;
//     }
// }

// 원본배열 swap 방식 연습
class Solution {
    public int[] solution(int[] num_list) {
        
        // 스왑하려면 
        int start = 0; // 맨 앞 인덱스
        int end = num_list.length - 1; // 맨 뒤 인덱스
        
        while(start < end) {
            // swap
            int tmp = num_list[start];
            num_list[start] = num_list[end];
            num_list[end] = tmp;
            
            // 하나씩 이동함
            start++;
            end--;
            
        }
        
        return num_list;
    }
}
