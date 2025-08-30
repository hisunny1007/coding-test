import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
	
		Scanner sc = new Scanner(System.in);
						
		int t = sc.nextInt();
		
		for(int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt(); // 숫자 개수(4의 배수)
			int k = sc.nextInt(); // k번째 큰 수
			
			String str = sc.next(); // 입력 문자열 (16진수)
						
			// 중복 제거해야하니까 set쓰자
			Set<Integer> set = new HashSet<>();
            
			// 아래 과정을 n/4만큼 반복 
			
			// 1. 현재 문자열을 n/4만큼 자르기 (4개의 문자열)
			// 2. 4개의 문자열 각각을 16진수 -> 10진수로 변환
			// 3. 10진수 숫자를 set에 넣기 (자동으로 중복 제거)
			// 4. 문자열을 한 칸 회전(맨 뒤-> 맨 앞)
			
			// n/4만큼 반복 다 끝나면 set을 정렬하고 k번째 값 구하기
			
			int len = n / 4; // 한 변의 길이

			// 회전은 len번만 함
			for(int rotate = 0; rotate < len; rotate++) {
				
				// 입력 문자열을 4개의 문자열로 만들고 10진수 변환해서 set에 넣기
				for(int i = 0; i < str.length(); i += len) {
					String part = str.substring(i, i + len); // n/4로 나눈 한 묶음 (4개의 문자열)
//				System.out.println(part); // 1B3 B3B 81F 75E	
					
					// 한 묶음을 16진수 -> 10진수로 변환
					int number = Integer.parseInt(part, 16);
					// 변환한 10빈수를 set에 넣기
					set.add(number);
				}
				
				// 원본 문자열 회전 (맨 마지막 문자가 맨 앞으로 이동)
				// 문자열을 붙여 만들기( 맨 마지막 문자 + 처음부터 맨 마지막-1)
				str = str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
			}
			
			// 정렬
			// set을 정렬하려면 List로 변환한 뒤 정렬해야 함.
			// set을 리스트에 넣기
			List<Integer> list = new ArrayList<>(set);
			
			// 내림차순 정렬
			Collections.sort(list, Collections.reverseOrder());
//			System.out.println(list);
			
			// k번째 큰 수 인덱스: k - 1
			int answer = list.get(k - 1);
			
			System.out.println("#" + tc + " " + answer);
			
		}// 테케 e
		
		
		sc.close();
	}//main
}//class
