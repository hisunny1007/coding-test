
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int maxSum = arr[0];      // 전체 최대합 (초기값: 첫 원소)
		int currentSum = arr[0];  // 지금 끝나는 구간의 최대합 (초기값: 첫 원소)

		int start = 0;    // 최종 최대합 구간의 시작 인덱스
		int end = 0;      // 최종 최대합 구간의 끝 인덱스
		int tempStart = 0; // 현재 누적합이 새로 시작된 위치(임시 시작점)
		
		// 10 -4 3 1 5 6 -35 12 21 -1
//		2 1 -4 3 4 -4 6 5 -5 1

//		currentSum : i번째 원소를 끝으로 하는 최대 연속합(지금 보고 있는 구간의 합)
//		tempStart : currentSum이 새로 시작된 인덱스 (만약 arr[i]로 새로 시작하면 tempStart=i)
//		maxSum 갱신 시 start=tempStart, end=i 로 실제 최댓값 구간 저장
		
		for(int i = 1; i < n; i++) {
			// arr[i]만 시작하는 게 나은 경우, 새 구간 시작
			if(arr[i] > currentSum + arr[i]) {
				 // 새로운 구간을 여기서 시작하는 게 더 낫다
				currentSum = arr[i];
				tempStart = i; // 새 구간 시작
			} else {
				// 기존 구간에 현재 값을 더해서 이어간다
				currentSum += arr[i];
			}
			
		    // 현재 끝나는 구간의 합이 전체 최대합보다 크면 갱신
			if(currentSum > maxSum) {
				maxSum = currentSum;
		        start = tempStart; // 현재 구간의 시작은 tempStart
		        end = i;           // 현재 구간의 끝은 i
			}
		}

		System.out.println(maxSum);
//        System.out.println("최대 부분합: " + maxSum);
//        System.out.println("구간: " + start + " ~ " + end);		
		
		
		sc.close();
	}//
}//
