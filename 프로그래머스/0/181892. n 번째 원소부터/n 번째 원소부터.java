import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(int[] num_list, int n) {
        
        // 임시 리스트 만들었고 배열로 변환시켜야함
        List<Integer> temp = new ArrayList<>();
        
        for(int i = n - 1; i < num_list.length; i++) {
            temp.add(num_list[i]);
        }
        
        
        // ArrayList -> 배열
        int[] answer = new int[temp.size()];
        
        for(int i = 0; i < temp.size(); i++) {
            // answer[i] += temp[i]; // array required, but List<Integer> found
            answer[i] += temp.get(i);
        }
        
        return answer;
    }
}