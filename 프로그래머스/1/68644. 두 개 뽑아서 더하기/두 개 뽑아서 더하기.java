import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        // Set -> 중복 허용 x
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        // Set에 담긴 값들을 정렬하기 위해 리스트 변환
        List<Integer> list = new ArrayList<>(set);

        // 오름차순 정렬 (Set은 순서를 보장하지 않음)
        Collections.sort(list);

        // 리스트를 -> int[] 배열로 변환
        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}