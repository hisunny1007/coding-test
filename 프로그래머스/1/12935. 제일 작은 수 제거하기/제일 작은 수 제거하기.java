class Solution {
    public int[] solution(int[] arr) {
        
        // arr 길이 1일 때
        if(arr.length == 1) {
            int[] answer = {-1};
            return answer;
        }
        
        // 그 외
        int[] answer = new int[arr.length - 1];
        int min = arr[0];
        int idx = 0;
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == min) continue;
            else {
                // answer[idx] = arr[i];
                // idx++;
                answer[idx++] = arr[i];
            }
        }
        
        return answer;
    }
}