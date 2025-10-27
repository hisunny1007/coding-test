import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 대소문자 구분 안 함
		String words = sc.next().toUpperCase();
		
		int[] cnt = new int[26]; // 알파벳 개수만큼 배열 만들기
		
		// 1. 글자 하나씩 꺼내서 개수 세기
		for(int i = 0; i < words.length(); i++) {
			char ch = words.charAt(i);
//			System.out.println(ch); // 문자 그자체
//			System.out.println(ch - 'A'); // 아스키코드
			
			cnt[ch - 'A']++; // 문자 -> 숫자
		}
		
		
//		System.out.println(Arrays.toString(cnt));
//		[0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 1, 0, 0, 1, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0]

		// 2. cnt 배열에서 가장 값이 큰 숫자에 해당하는 문자 찾기
		int max = 0;
		char answer = '?';
		
		for(int i = 0; i < 26; i++) {
			if(cnt[i] > max) {
				max = cnt[i]; 
				answer = (char) (i + 'A'); // 숫자 -> 문자
			} else if(cnt[i] == max) {
				answer = '?';
			}
		}
		
		System.out.println(answer);

		sc.close();
	}
}
