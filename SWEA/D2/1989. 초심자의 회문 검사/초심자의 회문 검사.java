import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
//		for(int tc = 1; tc <= T; tc++) {
//			String word = sc.next();
//			boolean isPal = true; // 처음에 회문으로 가정
//			
//			// 단어 길이
//			int len = word.length();
//			
//			// 문자열 길이 절반까지만 비교
//			
//			for(int i = 0; i < len / 2 ; i++) {
//				if(word.charAt(i) != word.charAt(len - 1 -i)) {
//					isPal = false; // 하나라도 다르면 회문 아님
//					break; // 회문 아니니까 더 비교 안 해도 됨
//				}
//			}
//			int answer = isPal ? 1 : 0;
//			System.out.println("#" + tc + " " + answer);
//		}
		
		// StringBuilder 사용
		for(int tc = 1; tc <= T; tc++) {
			String word = sc.next();
			
			StringBuilder sb = new StringBuilder(word);
			
			// 쉽게 출력하기 위해서 anwer 변수 저장 후 출력
			int answer = 0;
			
			if(word.equals(sb.reverse().toString())) {
//				System.out.println("#" + tc + " " + 1);
				answer = 1;
			} else {
//				System.out.println("#" + tc + " " + 0);
				answer = 0;
			}
			
			System.out.println("#" + tc + " " + answer);
		}
		
	}
}
