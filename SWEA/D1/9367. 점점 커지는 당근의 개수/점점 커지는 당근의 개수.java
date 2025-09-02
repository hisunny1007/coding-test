
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt(); // 당근 개수

			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt(); // 당근 크기
			}// 배열 입력받음
			
			// 연속으로 당근의 크기가 커진 경우 
			// 그 당근의 '개수' 알려줌
			// -> 무조건 1로 먼저 세고 시작함
			int count = 1;
			int max = 1;
			
			// 연속적으로 커지면 카운트하기
			for(int i = 0; i < n - 1; i++) {
				if(arr[i] < arr[i+1]) {
					count++;
					
					if(count > max) {
						max = count;
					}
					
				} else {
					// 값이 작아지면
					count = 1; // 카운트값 다시 초기화
				}
			}
		
			System.out.printf("#%d %d\n", tc, max);
		}//tc
		
		sc.close();
	}//
}//

// 연속으로 당근의크기가 커진 경우 세기
// 최대 개수 얼마?
