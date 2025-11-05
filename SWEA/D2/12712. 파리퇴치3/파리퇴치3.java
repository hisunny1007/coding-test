import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		// + 상하좌우
		int[] dr1 = {-1, 1, 0, 0};
		int[] dc1 = {0, 0, -1, 1};
		
		// x 좌상 우상 좌하 우하
		int[] dr2 = {-1, -1, 1, 1};
		int[] dc2 = {-1, 1, -1, 1};

		for(int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int[][] arr = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			int max = Integer.MIN_VALUE;
			
			// 배열 반복문 s
			// 기준점 정해지지 않아서 반복문 다 돌면서 전부 확인하기
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					
					// 영역의 합 구해야 함
					int sum = arr[i][j];
					
					// + 스프레이
					for(int dir = 0; dir < 4; dir++) {
						for(int k = 1; k <= m - 1; k++) {
							
							int nr = i + dr1[dir] * k;
							int nc = j + dc1[dir] * k;
							
							// 범위 확인
							if(nr < 0 || nr >= n || nc < 0 || nc >= n) {
								continue;
							}
							
							sum += arr[nr][nc];
						}
						
						if(sum > max) max = sum;
					}
					
					sum = arr[i][j];
					
					// x 스프레이
					for(int dir = 0; dir < 4; dir++) {
						for(int k = 1; k <= m - 1; k++) {
							
							int nr2 = i + dr2[dir] * k;
							int nc2 = j + dc2[dir] * k;
							
							// 범위 확인
							if(nr2 < 0 || nr2 >= n || nc2 < 0 || nc2 >= n) {
								continue;
							}
							
							sum += arr[nr2][nc2];
						}
						
						if(sum > max) max = sum;						
							
						
						} 
					}
					
				}// 배열 반복문 e
			
			System.out.println("#" + tc + " " + max);
			
			}//tc

		sc.close();
		
	}
}
