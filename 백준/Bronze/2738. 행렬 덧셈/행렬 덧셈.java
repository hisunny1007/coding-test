import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 행 크기
		int m = sc.nextInt(); // 열 크기
		
		// 행렬 배열 만들기
		int[][] a = new int[n][m];
		int[][] b = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				a[i][j] = sc.nextInt();
			}
		}
	
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				b[i][j] = sc.nextInt();
			}
		}
		
//		System.out.println(Arrays.deepToString(a));
//		System.out.println(Arrays.deepToString(b));
		
		// 행렬 a + 행렬 b 더하기
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(a[i][j] + b[i][j] + " "); // 4 4 4 6 6 6 5 6 100 
				// 줄바꿈 어떻게 하지?? => 행이 바뀔 때마다
                if(j == m-1) // 각 행의 마지막 열에서 줄바꿈 
                    System.out.println();
			}
		}

	}
}
