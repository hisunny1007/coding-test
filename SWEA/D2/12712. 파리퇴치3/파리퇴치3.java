
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		// 값 고정되어 있으니까 반복문 바깥으로 뺌
		// 델타값 정의 (스프레이 형태로 나누어서)
		// + 상 하 좌 우
		int[] dr1 = {-1, 1, 0, 0};
		int[] dc1 = {0, 0, -1, 1};
		
		// x 좌상 우상 좌하 우하
		int[] dr2 = {-1, -1, 1, 1};
		int[] dc2 = {-1, 1, -1, 1};
		
		// 테스트케이스 s
		for(int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt(); // 배열 크기 n*n
			int m = sc.nextInt(); // 스프레이 분사 크기
			
			int[][] arr = new int[n][n];
			
			// 배열 입력받음
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// 최대 파리수
			int max = Integer.MIN_VALUE;
			
			
			// 배열 반복문 s
			// 기준점은 정해져있지 않으니까 반복문 돌면서 전부 다 확인하기
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr.length; j++) {
					
					// 영역의 합 (자기 자신에다가 주변 탐색한 값 더하기)
					int sum = arr[i][j];
							
					// 스프레이가 +일 경우
					// 다음 좌표 확인
					// m-1 곱해야 함 ! 아님 -> 그럼 그냥 m-1칸만 보는 거임 ;; 
					// 그안에 1칸은..?..ㅎ
				
					//곱하는게,, 1부터,,, m-1까지,,,,
					for(int dir = 0; dir < 4; dir++) {
						for(int k = 1; k <= m -1; k++) {
							
							int nr = i + dr1[dir] * k; 
							int nc = j + dc1[dir] * k;

							
							// 범위 확인
							if(nr < 0 || nr >= n || nc < 0 || nc >= n) {
								continue;
							}
							
							// 자기 자신에다가 주변 탐색한 값 더하기
							sum += arr[nr][nc];							
						}
						
						// 최대랑 비교하기
						if (sum > max)
							max = sum;
					}
					
					sum = arr[i][j]; // 초기화를 해줘야 함!!!!!!!!!!!
					
					// 스프레이가 x일 경우
					for(int dir = 0; dir < 4; dir++) {
						for(int k = 1; k <= m -1; k++) {
							
							int nr2 = i + dr2[dir] * k; 
							int nc2 = j + dc2[dir] * k;
							
//							System.out.println("새로 이동할 r 좌표값" + nr2);
//							System.out.println("새로 이동할 c 좌표값" + nc2);
							
							// 범위 확인
							if(nr2 < 0 || nr2 >= n || nc2 < 0 || nc2 >= n) {
								continue;
							}
							
							// 자기 자신에다가 주변 탐색한 값 더하기
							sum += arr[nr2][nc2];
						}
						
						// 최대랑 비교하기
						if (sum > max)
							max = sum;
					}
					
				} //
			} // 배열 반복문 e

			System.out.println("#" + tc + " " + max);
			
		} // 테스트케이스 e

	}
}