import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		
//		File file = new File("./src/SWEA_1954_달팽이숫자/input.txt");
//		
//		Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		// 델타값 정의 (우 -> 하 -> 좌 -> 상)
		int[] dr = {0, 1, 0, -1}; // 상하좌우
		int[] dc = {1, 0, -1, 0};
		
		for(int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			
			int[][] arr = new int[n][n];
			
			// 시작점
			int r = 0;
			int c = 0;
			
			// 현재 방향 (우)
			int dir = 0;
			
			// 우선 시작점부터 값을 채움 (하나씩)
			for(int num = 1; num <= n*n; num++) {
				arr[r][c] = num;
				
				// 이동할 다음 지점 좌표 구하기
				int nr = r + dr[dir];
				int nc = c + dc[dir];
				
				// 이동해도 되는지 확인
				// 범위를 벗어났거나 or 0이 아닌 숫자가 있을 때
				// => 방향 전환해야 함
				if(nr < 0 || nr >= n || nc < 0 || nc >= n || arr[nr][nc] != 0) {
					dir = (dir + 1) % 4; // 방향 전환
					// 0, 1, 2, 3 이기 때문에
					
					// 방향전환한 새로운 좌표
					nr = r + dr[dir];
					nc = c + dc[dir];
				}
				
				// 실제 이동
				// 시작점이 새로운 좌표값으로 바뀜
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
					
		} // 테케 e
		
		
		
		sc.close();
	} // main e

} // 클래스 e

//		n*n 배열이 있어.
//		원래는 다 0인데 여기에 1부터 n*n까지 값을 채워나가야함!! 하 나 씩! (문제)
//		
//		n = 3일경우
//		1 2 3 
//		8 9 4
//		7 6 5
//		
//		우 - 하 - 좌 - 상 방향대로 계속 움직임
//		그럼 델타값을 이 방향대로 고정시키는 게 편할 듯
//		
//		그럼 언제 방향을 바꾸냐?
//		0. 기준점 (0,0)에서 쭉 오른쪽으로 값 채워넣음
//		1 2 3
//		0 0 0
//		0 0 0
//		1. 범위를 벗어났을 때 (4는 범위 벗어났으니까) 방향 아래로 전환하기
//		1 2 3
//		0 0 4
//		0 0 5
//		2. 동일 로직 반복하다가 9 입력하려고 보니까 그 자리에 1이 있음!!
//		=> 0이 아니면 방향 전환
//		1 2 3
//		8 0 4
//		7 6 5
//		*결론* 방향 전환
//		1. 범위를 벗어났을 때
//		2. 0이 아닌 값이 있을 때