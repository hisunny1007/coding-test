import java.util.Scanner;

public class Main {
	
	static int n;
	static int[][] drc = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
	static boolean[][] visited;
	static char[][] colorMap;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		visited = new boolean[n][n];
		colorMap = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			String str = sc.next();
			for(int j = 0 ; j < str.length(); j++) {
				colorMap[i][j] = str.charAt(j);
			}
		}
		
		// 1. 정상 시력 기준
		int normalCnt = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(!visited[i][j]) {
					normalCnt++;
					// isColorBlind 파라미터에 false 전달
					dfs(i, j, false);
				}
			}
		}
		
		// 2. 색약 기준
		int colorBlindCnt = 0;
		visited = new boolean[n][n]; // 두 번째 탐색 전 visited배열 초기화
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(!visited[i][j]) {
					colorBlindCnt++;
					// isColorBlind 파라미터에 true 전달
					dfs(i, j, true);
				}
			}
		}			
		
		System.out.println(normalCnt + " " + colorBlindCnt);
		sc.close();
	}
	
	public static void dfs(int r, int c, boolean isColorBlind) {
		visited[r][c] = true;
		char currentColor = colorMap[r][c];
		
		for(int i = 0; i < 4; i ++) {
			int nr = r + drc[i][0];
			int nc = c + drc[i][1];
			
			if(nr < 0 || nr >= n || nc < 0 || nc >= n) continue;
			if(visited[nr][nc]) continue;
			
			char nextColor = colorMap[nr][nc];
			
			// 색약인지 아닌지 분기
			if(isColorBlind) { // 색약 기준 - B/RG
				if(currentColor == 'B') {
					if(nextColor == 'B') {
						dfs(nr, nc, true);
					}
				} else { // R과 G는 같은 색으로 취급
					if(nextColor == 'R' || nextColor == 'G') {
						dfs(nr, nc, true);
					}
				}
			} else { // 정상시력 기준 - 현재 색과 다음 색이 완전히 같아야 함
				if(currentColor == nextColor) {
					dfs(nr, nc, false);
				}
			}
		}
	}
}
