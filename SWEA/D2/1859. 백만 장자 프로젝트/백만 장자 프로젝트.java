import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); // 테스트케이스 개수
		
		for(int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt(); // 연속 n일동안
			int[] price = new int[n]; // 가격 배열


			for(int i = 0; i < n; i++) {
				price[i] = sc.nextInt();
			}
			
			// 뒤에서 부터 확인하자
			// 최댓값을 구하고 그 이전 값이 더 작으면 최댓값 - 이전값 = 이익
			
			long profit = 0; // 이익 세기
			
			// 우선 맨 뒤의 값이 최댓값이라고 생각하자
			int max = price[n -1]; 
			
//			6426 9445 8772 81 3447

			for(int i = n - 1; i >=0; i--) {
				if(price[i] < max) {
					profit += (max - price[i]); // 최댓값에서 팔자 (price[i]에서 사서)
				} else {
					max = price[i];					
				}
			}
			
			System.out.printf("#%d %d%n", tc, profit);
			
		}// 테케e
		
	
		
		sc.close();
	}// main
}// class
