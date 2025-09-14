
import java.util.*;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		for(int t = 1; t <= 10; t++) {
			int tc = sc.nextInt();
			
			int n = 16;
			int[][] maze = new int[n][n];  // 16*16 미로
			int startR = 0, startC = 0; // 출발 좌표

			for(int i = 0; i < n; i++) {
				String str = sc.next();
				for(int j = 0; j < n; j++) {
					int num = str.charAt(j) - '0';
					maze[i][j] = num;
					
					// 출발점은 2
					if(maze[i][j] == 2) {
						startR = i;
						startC = j;
					}
					
				}
			}
			
			
			boolean[][] visited = new boolean[n][n];
			
			int[] dr = {-1, 1, 0, 0};
			int[] dc = {0, 0, -1, 1};
			
			// 정답 변수 (도달 가능하면 1로 갱신)
			int answer = 0;
			
			// bfs를 위한 큐 만들기
			// 정수배열[r,c]를 요소로 하는 큐를 만들고
			Queue<int[]> queue = new ArrayDeque<>();
			
			// 시작좌표(0, 0)방문체크하고 넣기
			visited[0][0] = true;
			queue.add(new int[] {startR, startC});
			
			while(!queue.isEmpty()) {
				int[] curr = queue.poll();
				
				int r = curr[0];
				int c = curr[1];
				
				visited[r][c] = true;
				
				// 도착점이면 도달 가능 (1 가능함)
				if(maze[r][c] == 3) {
					answer = 1;
					break;
				}
				
				
				// 4방향 탐색
				for(int i = 0; i < 4; i++) {
					int nr = r + dr[i];
					int nc = c + dc[i];
					
					// 범위를 벗어나면 넘어가
					if(nr < 0 || nr >= n || nc < 0 || nc >= n) continue;
					// 방문했거나 벽이면 넘어가
					if(visited[nr][nc] || maze[nr][nc] == 1) continue;
					
					visited[nr][nc] = true;
					queue.add(new int[] {nr, nc});
					
				}
			}

			System.out.println("#" + tc + " " + answer);
		}// tc
		
		sc.close();
	}//
}//
