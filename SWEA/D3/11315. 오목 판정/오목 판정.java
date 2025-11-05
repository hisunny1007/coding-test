import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	
	// 델타값 정의 (우, 하, 우하, 좌하)
	static int[] dr = {0, 1, 1, 1};
	static int[] dc = {1, 0, 1, -1};
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		int t = sc.nextInt();
		
		for(int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			
			// 문자열 배열
			char[][] arr = new char[n][n];
			
			for(int i = 0; i < n; i++) {
				String str = sc.next();
				arr[i] = str.toCharArray();
			}
			
//			System.out.println(Arrays.deepToString(arr));

			boolean found = false;
			int cnt = 0;
			
			// 탐색
			for(int r = 0; r < n; r++) {
				for(int c = 0; c < n; c++) {
					
					if(arr[r][c] == 'o') {
						for(int dir = 0; dir < 4; dir++) {
							
							cnt = 0; //
							
							for(int k = 0; k < 5; k++) {
								int nr = r + dr[dir] * k;
								int nc = c + dc[dir] * k;
								
								if(nr < 0 || nr >= n || nc < 0 || nc >= n)
									break;
								
								if(arr[nr][nc] == 'o') {
									cnt++;
								} else {
									break;
								}
								
								if(cnt >= 5) {
									found = true;
									break;
								}
							}
						}
					}
				}
			}// 탐색
			
			if(found) {
				System.out.println("#" + tc + " " + "YES");
			} else {
				System.out.println("#" + tc + " " + "NO");
			}
		}//tc

         
        sc.close();
    }//main
}//class