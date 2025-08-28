import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner sc = new Scanner(System.in);
//		File file = new File("./src/SWEA_2805_농작물_수확하기/input.txt");
//		Scanner sc = new Scanner(file);
		
		int t = sc.nextInt(); // 테스트케이스 개수
		
		
		// 이차원배열 입력받기
		for(int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt(); // 농장 크기
			int[][] arr = new int[n][n];
			
			for(int i = 0; i < n; i++) {
				 String line = sc.next();
				 
				 for(int j = 0; j < n; j++) {
					 arr[i][j] = line.charAt(j) - '0'; // 숫자 문자 -> 숫자
				 }
			}
			
//			System.out.println(Arrays.deepToString(arr));
		
			// 시작점을 찾아야 함

			//행 기준으로 할래
			//1 3 5 3 1
			//(0,2)
			//(1,1) (1,2) (1,3)
			//(2,0) (2,2) (2,3) (2,4)
			//(3,1) (3,2) (3,3)
			//(4,2)


			// 1. 중앙에서 떨어진 거리 distance
			// 2. 시작 열 distance
			// 3. 끝 열 n - 1 - distance
			
//			행 0: distance=2 열 2~2
//			행 1: distance=1 열 1~3
//			행 2: distance=0 열 0~4
//			행 3: distance=1 열 1~3
//			행 4: distance=2 열 2~2

			// 합
			int sum = 0;

			// 중앙 기준점
			int center = n / 2 ; // 중앙 행 번호

			// 행 반복
			for(int i = 0; i < n; i++) {

				//어떤 행 i 에서 중앙 행까지 떨어진 거리 
				int distance = Math.abs(center- i); //중앙 행에서 떨어진 정도 // 중앙과의 거리
				int start = distance; // 시작 열
				int end = (n - 1) - distance; // 마지막 열 // 마지막 index가 n - 1
				
				for(int j = start; j <= end; j++) {
					sum += arr[i][j]; // j 끝 열이 계속 바뀌는 것임!!
				}
			}

			System.out.printf("#%d %d%n", tc, sum); // 테케마다 줄바꿈
		}//
		
		sc.close();
	}//
}//
