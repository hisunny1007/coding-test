import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        
        // 숫자를 문자열로 변환
        String[] arr = new String[numbers.length];

        for(int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        
        // 정렬 // 내림차순 (가장 큰 수)
        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
    
        // 첫번째 수가 0이면 전체 0
        if(arr[0].equals("0")) return "0";
        
        StringBuilder sb = new StringBuilder();
        for(String s : arr) {
            sb.append(s);
        }
        
        return sb.toString();
    }
}