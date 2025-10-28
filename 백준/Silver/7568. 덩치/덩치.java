import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		// 사람의 수 n
		int n = sc.nextInt();
		
		int[][] arr = new int[n][2];
//		[[0, 0],[0, 0], [0, 0], [0, 0], [0, 0]]
		
		// n개 줄 입력받기
		for(int i = 0; i < n; i++) {
			arr[i][0] = sc.nextInt(); // 몸무게
			arr[i][1] = sc.nextInt(); // 키
//			System.out.println(Arrays.deepToString(arr));
//			[[55, 185], [58, 183], [88, 186], [60, 175], [46, 155]]	
		}
		
		
//		if(arr[i][0] > arr[i+1][0] && arr[i][1] > arr[i+1][1]) {
//			rank++;
//			cnt++;
//		}
		// 인접한 한 사람만 비교하는 것이 아니라 모든 사람과 비교해야 함
		// 자신보다 덩치가 큰 사람 수를 세서 rank = 1 + (덩치 큰 사람 수)
		
		// rank 배열 만들기
		int[] ranks = new int[n];
		
		
		for(int i = 0; i < n; i++) { // 각 사람(i) 기준으로
			int rank = 1; // 기본은 1등부터 시작
			
			for(int j = 0; j < n; j++) { // 모든 사람(j)과 비교
				if(i == j) continue; // 자기 자신은 건너뜀
				
				// j가 나(i)보다 덩치가 더 크면 rank 증가
				// (나보다 큰 사람이 한 명 있을 때마다 등수 + 1
				if(arr[j][0] > arr[i][0] && arr[j][1] > arr[i][1]) {
					rank++;
				}
			}
			
			// i번째 사람의 등수를 기록함
			ranks[i] = rank;
		}
		
		for(int rank : ranks) {
			System.out.print(rank + " ");
		}

		sc.close();
	}
}