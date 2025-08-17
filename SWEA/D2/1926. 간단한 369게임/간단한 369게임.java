import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
//		// n = 10일때 가능한 로직
//		for(int i = 1; i <= n; i++) {
//			if(i == 3 || i == 6 || i == 9) {
//				System.out.print("-" + " ");
//				continue;
//			}
//			System.out.print(i + " ");
//		}
		
		for(int i = 1; i <= n; i++) {
			
			// 우선 숫자를 문자열로 변환
			String s = Integer.toString(i);
			
			// 개수 세는 변수
			int count = 0;
			
			// 문자열 한 자리씩 검사
			for(int j = 0; j < s.length(); j++) {
				char c = s.charAt(j);

				// 3, 6, 9면 개수 세기
				if(c == '3' ||  c == '6' || c == '9') {
					count++;
//					System.out.println(c + "는" + count);
				}
			}// 문자열 검사 e
			
//			System.out.println(i + "는" + count);
			
			
			// 결과 출력
			if (count == 0) {
				System.out.print(i + " ");
			} else {
				// count 개수만큼 출력
				for(int k = 0; k < count; k++) {
					System.out.print("-");
				}
				// 띄어쓰기
				System.out.print(" ");
			}
			
		}// 테케 e
		
		
		sc.close();
	}// main e
}// class e