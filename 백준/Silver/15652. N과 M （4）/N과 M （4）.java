
import java.util.Scanner;
import java.util.Stack;

public class Main {
	static int n;
	static int m;
	static int[] arr;
	static Stack<Integer> resultStack;
	
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n];
		resultStack = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			arr[i] = i + 1; // 1부터 n까지 채움
		}
		
		combination(0);
		sc.close();
	}//main
	
	// [1, 2, 3]
	
	// 1 2 1 은 안됨 .. .
	// 중복조합같음 
	// 시작 인덱스가 무조건 뒤가 같거나 커야함
//	1부터 N까지 자연수 중에서 M개를 고른 수열
//	같은 수를 여러 번 골라도 된다. => 중복 허용
//	고른 수열은 비내림차순이어야 한다. => 어차피 오름차순 아님..?
//	길이가 K인 수열 A가 A1 ≤ A2 ≤ ... ≤ AK-1 ≤ AK를 만족하면, 비내림차순이라고 한다.	
	public static void combination(int start) {
		// 종료조건
		if(resultStack.size() == m) {
			for(int num : resultStack) {
				System.out.print(num + " ");
			}
			System.out.println();
			return;
		}// 종료조건
		
		// 재귀조건
		for(int i = start; i < n; i++) {
			
			// 비내림차순때문에 1 2 1  이런건 안됨
			// 비내림차순이어야 함
			// 시작 인덱스가 무조건 뒤가 같거나 커야함

//			if(arr[i] <= arr[i + 1]) {
//				resultStack.push(arr[i]);
//
//				combination(start);
//
//				resultStack.pop();
//				
//			}
		
			// 일단 넣어
			if(resultStack.isEmpty()) {
				resultStack.push(arr[i]);				
			} else { // 비어있지 않다면
				if(arr[i] >= resultStack.peek()) {
					resultStack.push(arr[i]);
				}
			}
			
			combination(i);

			resultStack.pop();
		
			
		} // 재귀조건
	}// combination
	
}//
