import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();

		
		for(int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt(); // 행
			int m = sc.nextInt(); // 열
			
			int[][] arr = new int[n][m];
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
//			System.out.println(Arrays.deepToString(arr));
			
			int maxLength = 0;

			// 행 검사
			for(int i = 0; i < n; i++) {
				
				int cnt = 0;
				
				for(int j = 0; j < m; j++) {
					if(arr[i][j] == 1) {
						cnt++;
					} else { // 1 연속이다가 0을 만났을 때 max값 갱신
						if(cnt > maxLength) {
							maxLength = cnt;
//							cnt = 0; // 여기서 초기화하면 안됨
						}
						cnt = 0; // 무조건 초기화
					}
				}
				
				// 한 줄 (가로) 확인 다 하고 마지막 값에서!!
				// 벽을 만나서 반복이 종료됐을 경우 max값 갱신
				if(cnt > maxLength) {
					maxLength = cnt;
				}
				
			}// 가로 탐색
			
			
			// 열 검사
			for(int j = 0; j < m; j++) {
				
				int cnt = 0;
				
				for(int i = 0; i < n; i++) {
					if(arr[i][j] == 1) {
						cnt++;
					} else {
						if(cnt > maxLength) {
							maxLength = cnt;
						}
						cnt = 0;
					}
				}
				
				if(cnt > maxLength) {
					maxLength = cnt;
				}
			}// 세로 탐색
			
//			System.out.print("#" + tc + " ");
//			if(maxLength >= 2) {
//				System.out.print(maxLength);
//			} else {
//				System.out.print(0);
//			}
//			System.out.println();
			
			System.out.printf("#%d %d%n", tc, (maxLength >= 2 ? maxLength : 0));
		}//tc
		
		
		sc.close();
	}//main
}//class