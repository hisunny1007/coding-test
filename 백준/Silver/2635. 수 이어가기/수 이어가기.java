import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 첫 번째 수
		
		int maxLen = 0;
		
		// 결과값 저장할 리스트
		List<Integer> result = new ArrayList<>();
		
		// 두 번째 수 후보: n부터 1까지 (양의 정수)
		for(int i = n; i > 0; i--) {
			
			// 임시 리스트
			List<Integer> list = new ArrayList<>();


			// 첫 번째 수 입력받고
			list.add(n);
			// 두 번째 수 넣고
			list.add(i);
			
			// 수열 만들기
			int first = n;
			int second = i;
			
			// 수열 만들기
			while(true) {
				int third = first - second;
				if(third < 0) {
					break;
				}
				
				list.add(third);
				first = second;
				second = third;

			}
			
			// 현재 list 길이가 이전에 찾은 result 최대 길이보다 길면
			if(list.size() > result.size()) {
				// result 리스트를 현재 list로 갱신함
				result = list;
			}
			
		} // 두번째 수 반복문 e
		
		System.out.println(result.size());
		for(int num : result) {
			System.out.print(num + " ");
		}
		
		
		sc.close();
		
	}// main e
}// class e