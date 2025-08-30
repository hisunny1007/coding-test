import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
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
			int n = sc.nextInt();
			int k = sc.nextInt();
			
			String str = sc.next();
			
			// 일단 저 입력받은 str을 4묶음으로 만들어야 함 (4개의 변)
			
			// 중복 제거위해 set이용
			Set<String> set = new HashSet<>(); // 문자열
			
			int len = n / 4; // 한 묶음 안의 원소 개수
			
			
			// 반복은 len만큼
			for(int r = 0; r < len; r++) {
				
				
				// 1. 한 묶음들을 set에 넣기
				//1B3, B3B, 81F, 75E
				// 인덱스는 0-2 / 3-5/ 6-8/ 9-11
				for(int i = 0 ; i < str.length(); i += len) {
					String word = str.substring(i, i+len); // 4묶음으로 만들기 (한 묶음 안의 원소 개수는 len)
//				System.out.println(word);
					
					// 이렇게 나온 한 묶음들을 set에 넣기
					set.add(word);
				}
				
				// 2. 맨 뒤 -> 맨 앞으로 회전
				// 문자열 덮어씌우기
				// 결국에 문자열은 맨뒤값 + 맨앞~맨뒤-1
				// substring(start, end) end는 포함안되니까
				str = str.charAt(str.length() - 1) + str.substring(0, str.length() - 1);
//				System.out.println(str);
//				1B3B3B81F75E
//				E1B3B3B81F75
//				5E1B3B3B81F7
//				75E1B3B3B81F

			}
			
			// n/4만큼 회전해서 나온 모든 묶음들이 set에 저장됨(중복은 알아서 제거)
//			System.out.println(set);
			// [B3B, 5E1, 1B3, 1F7, 3B3, F75, 75E, E1B, 3B8, B81, 81F]
			
			// 3. set에 있는 모든 원소 16진수 -> 10진수 변환
			// 4. 리스트에 저장 (set은 정렬안되므로 리스트로 바꾸기)
			List<Integer> list = new ArrayList<>();
			
			for(String s : set) {
				int num = Integer.parseInt(s, 16);
				list.add(num);
			}
			
//			System.out.println(list); // [2875, 1505, 435, 503, 947, 3957, 1886, 3611, 952, 2945, 2079]

			
			// 5. 정렬하고 k번쨰로 큰 수 찾기
			// set은 정렬안되므로 리스트로 바꾸기
			// 내림차순
			Collections.sort(list, Collections.reverseOrder());
//			System.out.println(list); // [3957, 3611, 2945, 2875, 2079, 1886, 1505, 952, 947, 503, 435]

			System.out.println("#" + tc + " " + list.get(k - 1));
		
			
		}//tc

	
		sc.close();
	}//
}//
