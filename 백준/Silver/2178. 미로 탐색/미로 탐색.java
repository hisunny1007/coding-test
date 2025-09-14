import java.util.*;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// n * m 미로
		int n = sc.nextInt(); 
		int m = sc.nextInt(); 
		
		int[][] maze = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			for(int j = 0; j < m; j++) {
				int num = str.charAt(j) - '0'; // 정수로 변환
				maze[i][j] = num;
			}
		}
		
		
		// visited 배열
		boolean[][] visited = new boolean[n][m];
		
		// 상하좌우 델타탐색
        int[] dr = {-1, 1, 0, 0};
        int[] dc = {0, 0, -1, 1};
        
        
        // bfs탐색을 위한 큐 만들기
        Queue<int[]> queue = new ArrayDeque<>();
        
        // 시작좌표 + 거리 큐에 넣기
        queue.add(new int[] {0, 0, 1});
        visited[0][0] = true;
        
        // 정답이 없으면 -1, 있으면 갱신
        int answer = -1; 
        
        // 큐가 빌 때까지 탐색
        while(!queue.isEmpty()) {
        	int[] curr = queue.poll();
        	
        	int r = curr[0];
        	int c = curr[1];
        	int dist = curr[2];
        	
        	if(r == n - 1 && c == m - 1) {
        		answer = dist;
        		break;
        	}
        	
        	// 4방향 탐색
        	for(int i = 0; i < 4; i++) {
        		int nr = r + dr[i];
        		int nc = c + dc[i];
        		
                // 범위, 방문, 벽 체크
                if (nr < 0 || nr >= n || nc < 0 || nc >= m) continue;
                if (visited[nr][nc] || maze[nr][nc] == 0) continue;
        		
        		
        		// 방문처리 -> 큐 삽입
                visited[nr][nc] = true;        			
    			queue.add(new int[] {nr, nc, dist + 1});

        	}
        }// while문
        
        
		System.out.println(answer);
	
		
		sc.close();
	}//
}//
