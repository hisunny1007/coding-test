import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        
        // 크기 순서대로 정렬
        
        Arrays.sort(array);
        
        // 길이는 홀수
        int n = array.length / 2;
        
        return array[n];
    }
}