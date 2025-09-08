class Solution {
    public int[] solution(int money) {
        
        // int[] answer = new int[2];
        
        // 아이스아메리카노 최대 잔 수
        int max = money / 5500;
        // int leftMoney = money - (5500*max);
        int leftMoney = money % 5500;
        
//         answer[0] = max;
//         answer[1] = leftMoney;
        
//         return answer;
        
        return new int[] {max, leftMoney};
        
    }
}