import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc = 1; tc <= 10; tc++) {
			
			int n = sc.nextInt(); // n*n 배열
			int m = sc.nextInt(); // m*m 파리채
			
			
			int[][] arr = new int[n][n];
			
			// 배열 입력받기
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					arr[i][j] =sc.nextInt();
				}
			} //

			// 최대값 구하기 위한 변수
			int max = Integer.MIN_VALUE;	
		
			// 시작점은 왼쪽 위, // 시작점은 계속 움직여야 함..
			// m = 2 / i = 0 1 2 3
			// m = 3 / i = 0 1 2
			// 00 01
			// 10 11
			
			// 01 02
			// 11 12
			
			// 02 03
			// 12 13
			
			// 03 04
			// 13 14
			
			// 전체 탐색
			for(int i = 0; i <= n - m; i++) {
				for(int j = 0; j <= n - m; j++) {
	
					int sum = 0; // m * m 파리채 죽은 파리 개수 더하기
					
					// m * m 행렬 구간합  구하기					
					for(int r = i; r <= i + m -1; r++) {
						for(int c = j; c <= j + m -1; c++) {
							sum += arr[r][c];
						}
					} //
					
					if(sum > max) {
						max = sum;
					}
					
				}//
			} // 시작점 e
			
			System.out.println("#" + tc + " " + max);			
			
		} // test case e
		
		sc.close();
	}// main e
}// class e


// 오후 4시 10분 . 설계 5분 / // 5시
//n*n 배열 안의 숫자 - 파리 개수
//m*m 파리채 내리쳐 죽은 파리 개수 (한번, 최대한 많은 파리)
//그럼 기준점 없으니까 전체 배열을 돌면서
// 시작점은 왼쪽 맨 위로 두고 m * m 행렬 합 구하기
