class Solution {
    public int[] solution(String[] strlist) {

        int n = strlist.length;
        
        int[] answer = new int[n];

        // answer[0] = strlist[0].length();
        // answer[1] = strlist[1].length();
        // answer[2] = strlist[2].length();
        // answer[3] = strlist[3].length();
        
        
        for(int i = 0; i < n; i++) {
            answer[i] = strlist[i].length();
        }
        
        return answer;
    }
}