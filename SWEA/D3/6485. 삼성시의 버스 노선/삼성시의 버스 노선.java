import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		// 10시 20분 -> 11시 20분 테케 1개..?
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();

		// 테스트케이스 s
		for(int tc = 1; tc <= t; tc++) {
			
			
			// 배열을 테케 밖에다 하니까 다음 테케 돌 때 배열 초기화가 안 돼!!
			// 기존값 누적돼있었음
			// 정류장 배열
			int[] busStop = new int[5001]; // 1번부터 시작하니까 5001개로 만듦
//			System.out.println(Arrays.toString(busStop)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

			
			// 버스 노선 N개
			int n = sc.nextInt(); // n = 2 // 버스 노선 2개 (1번 노선, 2번 노선)
			
			for(int i = 0; i < n; i++) {
				int start = sc.nextInt(); // 1 // 1번 정류장
				int end = sc.nextInt(); // 3 // 3번 정류장
				
				for(int j = start; j <= end; j++) {
					busStop[j]++; // j번 인덱스가 j번 정류장 그 자체임 (0번 부터 시작해서 5001개로 맞춤)
				}
//				System.out.println("새로운 배열");
//				System.out.println(Arrays.toString(busStop));
//				[0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0]
//				[0, 1, 2, 2, 1, 1, 0, 0, 0, 0, 0]

			}
			
			int p = sc.nextInt(); // p = 5 // 5개의 버스 정류장 (알고 싶은 정류장 개수)
			
			// 구해야 하는 정류장 결과
			System.out.print("#" + tc + " ");
			
			for(int i = 0; i < p; i++) {
				int busStopNum = sc.nextInt();
		
				System.out.print(busStop[busStopNum] + " ");
			}
			System.out.println();
			
			
			// n = 2
			// 1번 버스 : 1번 정류장, 2번 정류장, 3번 정류장만을 다님
			// 2번 버스 : 2번 정류장, 3번 정류장, 4번 정류장, 5번 정류장만을 다님
			
			// p = 5
			// 1번~5번 각 정류장에 몇 개의 버스 노선이 다니는지 구해라
			// 1번 정류장 1번버스 // 1
			// 2번 정류장 1번버스, 2번버스 // 2 
			// 3번 정류장 1번버스, 2번버스 // 2
			// 4번 정류장 2번버스 // 1
			// 5번 정류장 2번버스 // 1

			
		} // 테스트케이스 e
		
		
	} // 메인 e
} // 클래스 e
