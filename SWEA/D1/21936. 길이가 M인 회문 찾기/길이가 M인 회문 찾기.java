import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 테스트케이스 개수
		int T = sc.nextInt();

		// 테케 반복
		for(int tc = 1; tc <= T; tc++) {
			
			int n = sc.nextInt();
			int m = sc.nextInt(); // 회문의 길이
			
			String words = sc.next(); // 일단 문자열 받고 "abcbd"
			char[] arr = words.toCharArray(); // 문자 배열로 바꿈 ['a', 'b', 'c', 'b','d']
			
			String answer = ""; // null보다 ""초기화하는 게 문자열 나중에 붙일 때 좋음
			
			// 길이 m만큼 잘라서 확인하고 다음 위치로 한칸 이동해서 확인함
			// 시작인덱스 i 바꿔가면서 m글자짜리 구간 반복 검사함
			for(int i = 0; i <= n - m; i++) {
				boolean isPal = true; // 우선 부분문자열이 회문이라고 가정함

				// 시작인덱스i / 마지막인덱스 i + (m - 1)
				// 오른쪽에서 j번째 i + m - 1 - j
				for(int j = 0; j < m / 2; j++) {
					if(arr[i+j] != arr[i + m - 1 - j]) {
						isPal = false;
						break; // 회문 아니니까 비교 끝냄
					}
					
				}
				
				if(isPal) {
					answer = words.substring(i, i +m);
					break; // 회문 찾았으면 바로 끝내야 함
					// 없으면 i = 2일 때 none으로 덮어씌워짐
				} else {
					answer = "NONE";
				}
			}
				
            System.out.println("#" + tc + " " + answer);

		} // 테케 e
	} // main e
} // 클래스 e