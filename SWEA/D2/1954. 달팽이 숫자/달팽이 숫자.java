import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		// 델타값 정의 (우 하 좌 상)
		int[] dr = {0, 1, 0, -1};
		int[] dc = {1, 0, -1, 0};
		
		for(int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			
			int[][] arr = new int[n][n];
			
			// 시작점 정의
			int r = 0;
			int c = 0;
			
			// 현재 방향 (우)
			int dir = 0; 
			
			// n*n 값 채우기
			for(int num = 1; num <= n * n; num++) {
				// 우선 arr[0][0]에 1 넣음
				arr[r][c] = num;
				
				// 이동할 다음 지점 좌표 구하기
				int nr = r + dr[dir];
				int nc = c + dc[dir];
				
				// 범위 확인
				if(nr < 0 || nr >= n || nc < 0 || nc >= n || arr[nr][nc] != 0) {
					dir = (dir + 1) % 4; // 방향 전환
					// 0 , 1, 2, 3
					
					// 방향전환한 새로운 좌표
					nr = r + dr[dir];
					nc = c + dc[dir];					
				}
				
				// 실제 이동 (시작점이 새로운 좌표값으로 바뀜)
				r = nr; 
				c = nc;
			}
			
			// 값 출력하기
			System.out.println("#" + tc);
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
			
		}// tc
		
		
		sc.close();
	}// main 
}//class
