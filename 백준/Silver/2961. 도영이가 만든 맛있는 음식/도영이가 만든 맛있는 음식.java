import java.util.Scanner;

//public class Main {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		int n = sc.nextInt();
//		
//		int[] sour = new int[n];
//		int[] bitter = new int[n];
//		
//		int s = 1; // 곱
//		int b = 0; // 합
//		
//		for(int i = 0; i < n; i++) {
//			sour[i] = sc.nextInt();
//			bitter[i] = sc.nextInt();
//			
//			s *= sour[i];
//			b += bitter[i];
//			
//		}
//		
//		int answer = s - b;
//		System.out.println(Math.abs(answer));
//
//		sc.close();
//	}
//}

// 재료를 다 쓰는 게 아니라 신맛-쓴맛 차이가 최소가 되도록 조합 선택해야 함
// 마지막 테케 안 맞음

public class Main {
	static int n;
	static int[] sour;
	static int[] bitter;
	static int answer = Integer.MAX_VALUE; // 최소값 구해야 함
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		sour = new int[n];
		bitter = new int[n];
		
		for(int i = 0; i < n; i++) {
			sour[i] = sc.nextInt();
			bitter[i] = sc.nextInt();
		}
		
		// 신 맛은 곱, 쓴 맛은 합이어서 초기값 1, 0
		// 시작: depth=0, currentSour=1, currentBitter=0, used=false(아직 선택 없음)
		dfs(0, 1, 0, false);

		System.out.println(answer);
		sc.close();
	}// main
	
	// 조합 dfs 구현
	// depth: 현재 인덱스, currentSour: 곱, currentBitter: 합, used: 하나 이상 선택했는지
	static void dfs(int depth, int currentSour, int currentBitter, boolean used) {
		// 종료조건 (모든 재료 다 확인했을 때)
		if(depth == n) {
			if(used) { // 재료는 적어도 하나 사용해야 함 (하나 이상 무조건 선택해야 함)
				// 신맛-쓴맛 절대값 최소화
				answer = Math.min(answer, Math.abs(currentSour - currentBitter));
			}
			return;
		}
		
		// 재귀조건
		// 1. 현재 재료 선택하는 경우
		dfs(depth + 1, currentSour * sour[depth], currentBitter + bitter[depth], true);
		
		// 2. 현재 재료 선택 안 하는 경우
		dfs(depth + 1, currentSour, currentBitter, used);
	}

}//class