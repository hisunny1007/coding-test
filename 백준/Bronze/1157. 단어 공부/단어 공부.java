
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 대소문자 구분 안함
		String words = sc.next().toUpperCase();
				
		int[] cnt = new int[26];
		
		
		
		// 1. 글자 하나씩 꺼내서 개수 세기
		for(int i = 0; i < words.length(); i++) {
			char ch = words.charAt(i);
//			System.out.println(ch - 'A'); 
			
			cnt[ch - 'A']++; // 문자 -> 숫자 
		}
		
		
//		System.out.println(Arrays.toString(cnt));
		
		// 2. 가장 많이 나온 횟수랑 그 문자 찾기
		int max = Integer.MIN_VALUE;
		char answer = '?';
		
		
		for(int i = 0; i < 26; i++) {
			if(cnt[i] > max) {
				max = cnt[i];
				answer = (char) (i + 'A'); // 숫자 -> 문자
			} else if(cnt[i] == max) {
				answer = '?'; // 같은 알파벳 여러 개면 그냥 다시 물음표
			}
		}
		System.out.println(answer);

		sc.close();
		
	}
}


// ch - 'A' : 문자를 숫자 인덱스로 바꾸는 공식
// 'A' → 배열의 0번 인덱스
// 'B' → 배열의 1번 인덱스
// 'C' → 배열의 2번 인덱스