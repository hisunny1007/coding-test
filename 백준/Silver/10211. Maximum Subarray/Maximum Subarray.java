
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
	        // 초기값 (배열이 모두 음수일 수도 있으므로 arr[0]으로 세팅)
	        int maxSum = arr[0];      // 지금까지 찾은 "전체 최대 연속합"
	        int currentSum = arr[0];  // i번째 원소까지 고려한 "현재 구간의 최대 연속합"

	        int start = 0;      // 전체 최대합 구간의 시작 인덱스
	        int end = 0;        // 전체 최대합 구간의 끝 인덱스
	        int tempStart = 0;  // 현재 누적합이 시작된 지점 (임시 저장용)
			
	        // 배열의 두 번째 원소부터 탐색
	        for (int i = 1; i < n; i++) {
	            // "현재 값(arr[i])만" 단독으로 쓰는 게 나은지,
	            // "기존 currentSum에 arr[i]를 이어붙이는 게" 나은지 판단
	            if (arr[i] > currentSum + arr[i]) {
	                // arr[i]로 새 구간 시작
	                currentSum = arr[i];
	                tempStart = i;   // 새 구간의 시작점을 i로 기록
	            } else {
	                // 기존 구간에 arr[i]를 이어붙임
	                currentSum += arr[i];
	            }

	            // 현재까지의 합이 지금까지의 최대합보다 크면 갱신
	            if (currentSum > maxSum) {
	                maxSum = currentSum;
	                start = tempStart; // 최종 시작점은 지금 구간이 시작된 곳
	                end = i;           // 최종 끝점은 현재 i
	            }
	        }
			
			System.out.println(maxSum);
			
		}// tc
		
		sc.close();
	}//
}//
