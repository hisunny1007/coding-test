import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc = 1; tc <= t; tc++) {
			
			int n = sc.nextInt();
			
			// n*n 빈 판 만듬 (전부 0인데 이걸 숫자로 채워야함)
			int[][] arr = new int[n][n];
			
			// 우 -> 하 -> 좌 -> 상 순서대로 탐색할 것임
			// 그러면서 1~n 숫자 채워넣기
			
			// 1. 델타값 정의 (우-하-좌-상)
			int[] dr = {0, 1, 0, -1};
			int[] dc = {1, 0, -1, 0}; 
			
			// 2. 시작점 정의
			int r = 0;
			int c = 0;
			// 방향을 규칙적으로 바꾸는 게 아니니까 일단 변수로 만들기
			int dir = 0; // 우측부터 갈 것임.
			
			// 시작점에 숫자 1 넣고 ~  숫자 n 까지 채워나갈 것임
			for(int num = 1; num <= n*n; num++) {
				arr[r][c] = num; // 현재 위치에 숫자 넣음
				// arr[0][0] = 1 집어넣음

				// 다음으로 이동할 좌표 탐색하기 (dir=0이니까 우측)
				int nr = r + dr[dir]; 
				int nc = c + dc[dir];
				
				// 다음 좌표를 확인해야돼
				// 해당 좌표가 범위를 벗어났거나 이미 숫자가 있다면 방향 전환하고
				// 전환된 방향으로 좌표를 다시 재설정한다
				// 1. 범위 밖이거나
				// 2. 다음 좌표에 이미 0이 아닌 값이 있는지
				// => 1 or 2 => 방향전환
				// => 범위 안이고 값이 0이라면 킵고잉
			
				if (nr < 0 || nr >= n || nc < 0 || nc >= n || arr[nr][nc] != 0) {
					// 방향 전환해야돼
					dir = (dir + 1) % 4; // 방향전환 
					
					// 방향전환한 새로운 좌표
					nr = r + dr[dir];
					nc = c + dc[dir];
				}
				
				// 다음 좌표로 실제 이동함
				r = nr;
				c = nc;

//				System.out.println("다음 좌표 r은 " + r);
//				System.out.println("다음 좌표 c은 " + c);

			}
			
			
            // 결과 출력
            System.out.println("#" + tc);
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
            
		} // 테케 e
		
		
		sc.close();
	}
}
