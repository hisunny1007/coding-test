
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		// 각 알파벳에 단어가 몇 개 포함되어 있는지 구하여라
		// a ~ z -> 26개
		
		// 문자열로 하나씩 뜯어서 확인하기
		
		// 카운팅 배열 만들기
		int[] cnt = new int[26]; // a ~ z 26개
		
		for(int i = 0; i < str.length(); i++) {
			int num = str.charAt(i) - 'a'; // 'a'를 빼서 0~25로 변환
			cnt[num]++;
		}

		for(int c : cnt) {
			System.out.printf("%d ", c);
		}
		
		
		sc.close();
	}//
}//
