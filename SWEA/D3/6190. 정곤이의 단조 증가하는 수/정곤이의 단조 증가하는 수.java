import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		// 테케 1개라고 반복문 안 필요한 거 아님
		for(int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			
			// 배열 만들고 입력받기
			int[] arr = new int[n];
			
			for(int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
//		System.out.println(Arrays.toString(arr)); // [2, 4, 7, 10]
			
			
			// 최대값
			int max = -1; // 단조 증가 곱 없을 땐 -1 출력
			
			// 기준값 x 바로 다음값 곱하기
			for(int i = 0; i < n; i++) {
				for(int j = i + 1; j < n; j++) {
					int product = arr[i] * arr[j];
					
					// product를 int에서 String으로 바꾸기
					String str = Integer.toString(product);
					
					// 일단 참으로 가정
					boolean isMono = true;
					
					
					// 문자열 - 문자 하나씩 뜯어서 비교해보기
					for(int k = 0; k < str.length() - 1; k++) {
						// 앞이 더 크면 끝남 
						if(str.charAt(k) > str.charAt(k + 1)) {
							isMono = false;
							break;
						}
					}
					
					
					if(isMono && product > max) {
						max = product;
					} 

				}
			}//
			
			System.out.println("#" + tc + " " + max);
		}// 테케 e
		
		sc.close();
		
	}// main e
}// class e

// 2 4 7 10
// -> 2*7
// -> 4*7
// 배열로 만들어서 두개씩 탐색
// 각 숫자의 자릿수-> 정수 -> 문자열 -> 하나씩 뜯어보기