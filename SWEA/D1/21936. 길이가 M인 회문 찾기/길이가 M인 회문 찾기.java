import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 4시 38분 -> 5시 18분
		// 테스트케이스 개수
		int T = sc.nextInt();
		String answer = null;

		// 테케 반복
		for(int tc = 1; tc <= T; tc++) {
			
			int n = sc.nextInt();
			int m = sc.nextInt(); // 회문의 길이
			
			String words = sc.next(); // 일단 문자열 받고 "abcbd"
			char[] arr = words.toCharArray(); // 문자 배열로 바꿈 ['a', 'b', 'c', 'b','d']
				
			
				// 길이를 m개씩 짤라서 회문인지 판단해야 함
				// m = 3일때 abc bcb cbd
				// words[j] - 012, 123, 234
				// j = 0, 1, 2
				for(int j = 0; j <= arr.length - m; j++) {

					if(arr[j] == arr[j+2]) {
						answer = arr[j] + "" + arr[j+1] + "" + arr[j+2];
						break;
					} else {
						answer = "NONE";
					}
					
				}
				System.out.println("#" + tc + " " + answer);

		} // 테케 e
	} // main e
} // 클래스 e
