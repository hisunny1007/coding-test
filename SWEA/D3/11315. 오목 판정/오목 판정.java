import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
	
			
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		
		//델타값 4방향 정의 (우, 하, 우하, 좌하)
		int[] dr = {0, 1, 1, 1};
		int[] dc = {1, 0, 1, -1};

		for(int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			sc.nextLine(); // 버퍼 비우기
			
			// 문자가 들어오니까 char 배열
			char[][] board = new char[n][n]; 
			
			
			for(int i = 0; i < n; i++) {
				String str = sc.nextLine(); // 줄 하나씩 읽기
				board[i] = str.toCharArray(); 
			}
//			System.out.println(Arrays.deepToString(board));
		
			
			// 처음에는 false라고 가정
			boolean found = false;
			// 개수 세기
			int count = 0;
			
			
			// 배열 전체를 돌면서 (기준점 특정 x) 4방향 탐색
			for(int r = 0; r < n; r++) {
				for(int c = 0; c < n; c++) {
					
					
					// 돌이 있다면
					if(board[r][c] == 'o') {
						// 그 지점을 시작점으로 해서 4방향 탐색
						for(int dir = 0; dir < 4; dir++) {
							
							count = 0; // 각 방향 dir마다 count 초기화
							
							// 기존 좌표 (r, c)
							// 새로운 좌표값 (nr, nc)
							for(int k = 0; k < 5; k++) {
								int nr = r + dr[dir] * k;
								int nc = c + dc[dir] * k;
								
								// 범위 확인
								if(nr < 0 || nr >= n || nc < 0 || nc >=n)
									break;
								
								// 새로운 지점이 'o'이면 개수 세기
								if(board[nr][nc] == 'o') {
									count++;									
								} else { // 돌이 아니면 끝내기
									break;
								}
								
								// dir 한 방향만 확인했어도 count 다섯 개 이상이면 yes 출력
								if(count >= 5) {
									found = true;
									break; // 방향 끝
								}

							}
							
						}// 4방탐색
						
						
					}// 돌이 있는 곳에서 탐색
					
					// 한 줄씩 확인
				}//
			}//
			

			System.out.printf("#%d %s\n", tc, found ? "YES" : "NO");
		}//test
		
		sc.close();
	}//main
}//class