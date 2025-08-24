import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 스위치 개수
		int[] switchArr = new int[n+1]; // 1번 스위치 ~ n번 스위치
		
		// 스위치 배열 입력받기
		for(int i = 1; i < switchArr.length; i++) {
			switchArr[i] = sc.nextInt();
		}//
		
		int student = sc.nextInt(); // 학생 수
		
		for(int i = 0; i < student; i++) {
			int gender = sc.nextInt();
			int number = sc.nextInt();
			
			// 스위치 배열 다 돌 필요 없음 여학생은 number 기준으로만 처리하면 됨
				
			if(gender == 1) { // 남학생이면
				// 번호가 number의 배수인 스위치만 토글
//				for(int j = 1; j < switchArr.length; j++) {
//					if(j % number == 0) { // 스위치 번호가 자기가 받은 번호의 배수면
//						switchArr[j] = 1 - switchArr[j]; // 스위치 상태 변경(1->0 or 0->1)
//					}
//				}
				
				for(int j = number; j < switchArr.length; j += number) {
					switchArr[j] = 1 - switchArr[j]; // 스위치 상태 변경(1->0 or 0->1)
				}
//				j += number / 매번 number만큼 건너뛰면서 배수 인덱스만 접근
				
			} else { // 여학생이면 (gender == 2)

					
				// 2. 받은 번호의 스위치를 중심으로 좌우 대칭 파악
				// -> 배열 범위 넓혀가면서 탐색
				// -> 배열 범위 벗어나면 중단
				
				int left = number;
				int right = number;
				// ex. 3 // 2 4  // 1 5 //
				// ex. 5 // 4 6  // 3 7  // 2 8 
				// 좌우로 범위 확장
				while(left > 1 && right < n) {
					if(switchArr[left - 1] == switchArr[right + 1]) {
						left--;
						right++;
					} else {
						break;
					}
				}// while e
					
				// 최종구간뒤집기
				for(int k = left; k <= right; k++) {
					switchArr[k] = 1 - switchArr[k];
				}
					
					
			}
				
		}// for문 e
		
		// 결과 출력
		for(int i = 1; i < switchArr.length; i++) {
			System.out.print(switchArr[i] + " ");
			if(i % 20 == 0) {
				System.out.println();
			}
		}
		
		
		sc.close();
	}// main e
}// class e