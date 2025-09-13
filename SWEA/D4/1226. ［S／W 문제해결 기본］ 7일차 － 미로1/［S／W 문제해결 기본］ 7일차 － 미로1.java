import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(int t = 1; t <= 10; t++) {
			int tc = sc.nextInt();
			
			int n = 16;
			int[][] map = new int[n][n]; // 16 * 16 미로
			
			// 시작좌표
			int startR = 0;
			int startC = 0;
			
			for(int i = 0; i < n; i++) {
				String str = sc.next();
				for(int j = 0; j < n; j++) {
					int num = str.charAt(j) - '0';
					map[i][j] = num;
					
					// 출발점 찾기
					if(num == 2) {
						startR = i;
						startC = j;
					}
				}
			}// 미로 입력받기
			
			// bfs 큐 만들기
			//정수배열[r,c]를 요소로 하는 큐를 만들고
			Queue<int[]> q = new ArrayDeque<>();
			// 출발점을 큐에 넣기
			q.add(new int[] {startR, startC});

//			for(int[] pos : q) {
//			    System.out.print(Arrays.toString(pos) + " ");
//			}
			// 상하좌우 4방향 탐색해야 함
			int[] dr = {-1, 1, 0, 0};
			int[] dc = {0, 0, -1, 1};
			// 방문한 곳 확인해야 함
			boolean[][] visited = new boolean[n][n];
			
			// 도달하면 1
			int ans = 0;
			
			// 큐가 빌 떄까지 확인해야 함
			// 큐에서 좌표를 꺼내 방문체크함
			// 꺼낸 좌표가 목표3이면 ans=1 조기종료
			while(!q.isEmpty()) {
				int[] arr = q.poll(); // 시작점

				int r = arr[0];
				int c = arr[1];
				
				visited[r][c] = true;
				
				if(map[r][c] == 3) {
					ans = 1;
					break;
				}
				
				// 4방향 검사
				for(int i = 0; i < 4; i++) {
					int nr = r + dr[i];
					int nc = c + dc[i];
					
					// 범위 밖이거나 이미 방문했다면 건너뜀
					if(nr < 0 || nr >= n || nc < 0 || nc >= n || visited[nr][nc]) continue;
					
					if(map[nr][nc] == 0 || map[nr][nc] == 3) {
						q.add(new int[] {nr, nc});
					}
				}
			}
			
			
			System.out.println("#" + tc + " " + ans);
			
		}//tc
		
		
		sc.close();
	}//
}//
