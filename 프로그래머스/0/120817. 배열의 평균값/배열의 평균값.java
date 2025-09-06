class Solution {
    public double solution(int[] numbers) {
        
        int sum = 0;
        
        for(int num : numbers) {
            sum += num;
        }
        
        return (double) sum / numbers.length;
//         sum이 double로 변환됨
//         즉, 55 → 55.0
//         55.0 / 10 연산 → 실수 나눗셈
        
    }
}
        // int sum = 0;
        // double answer = 0;
        // answer = sum / numbers.length; (이미 int 나누기 int : 정수 나눗셈 -> 소수점 잘림)
