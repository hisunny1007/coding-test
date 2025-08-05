import java.util.Scanner;

class Solution {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int T = 10;
		
		// N * M 이차원 배열 만들기
		int n = 100;
		int m = 100;
		
		int[][] arr = new int[n][m];
		
			
		for(int tc = 1; tc <= T; tc++) {			
			int no = sc.nextInt();

			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			
			// 최대값 구해야하니까 변수 선언
			// maxNum 계속 갈아끼워짐
			int maxNum = 0;
			
			// 행의 합
			for(int i = 0; i < n; i++) {
				int rowSum = 0;
	
				for(int j = 0; j < m; j++) {
					rowSum += arr[i][j];
				}
				
	//			System.out.println("Row " + i + " sum: " + rowSum); 
				
				if(rowSum > maxNum) {
					maxNum = rowSum;
				}
			}
					
					
			// 열의 합
			for(int j = 0; j < m; j++) {
				int columnSum = 0;
				
				for(int i = 0; i < n; i ++) {
					columnSum += arr[i][j];
				}
	//		    System.out.println("Column " + j + " sum: " + columnSum); 
	
			    if(columnSum > maxNum) {
			    	maxNum = columnSum;
			    }
			}
		
		// 대각선의 합
		// 왼-> 오 대각선
		// 00 ~ 100100까지 더하기
			int leftLine = 0;
			for(int i = 0; i < n; i++) {
				leftLine += arr[i][i];
			}
			
			if(leftLine > maxNum) {
				maxNum = leftLine;
			}
	
		    // 오 -> 왼 대각선
            //	arr[0][4] + arr[1][3] + arr[2][2] + arr[3][1] + arr[4][0]
		    int rightLine = 0;
			for(int i = 0; i < n; i++) {
				rightLine = arr[i][n-1-i];
			}
			
			if(rightLine > maxNum) {
				maxNum = leftLine;
			}		
			
			System.out.println("#" + no + " " +maxNum);
		}
	}
}