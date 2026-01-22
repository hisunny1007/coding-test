import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        
        Arrays.sort(people);
        
        // 가장 가벼운 사람
        int left = 0;
        // 가장 무거운 사람
        int right = people.length - 1;
        
        int count = 0;
        
        while(left <= right) {
            if(people[left] + people[right] <= limit) {
                left++;
                right--;
            } else {
                // 아니면 무거운 사람 혼자 태움
                // -> (최대한 빨리 처리해야 전체 보트 수 줄일 수 있음)
                // 가벼운 사람은 다음 보트로
                right--;
            }
            count++;
        }
        
        return count;
    }
}