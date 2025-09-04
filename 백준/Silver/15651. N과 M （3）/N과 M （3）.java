
import java.util.Scanner;
import java.util.Stack;

public class Main {
	static int n;
	static int m;
	static int[] arr;
	static int[] visited;
	static Stack<Integer> resultStack;
	static StringBuilder sb;
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); // 1 ~ n 자연수
		m = sc.nextInt(); // m개 고르기(중복 가능)
		// 중복 가능하니까 visited 필요없음
		
		arr = new int[n]; // 길이가 n인 원본배열
		visited = new int[n];
		resultStack = new Stack<>();
		sb = new StringBuilder();
		
		for(int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		
		permutationWithRepetition();
		System.out.println(sb.toString());
		sc.close();
	}//main
	
	// 1부터 N까지 자연수 중에서 M개를 고른 순열 (중복o)
	// permutation(int[] arr, boolean[] visited, Stack<Integer> resultStack)
	public static void permutationWithRepetition() {
		// 종료조건
		// m개 다 뽑았을 때
		if(resultStack.size() == m) { // resultStack의 크기가 m이랑 같을 때
			
			// 시간초과남 -> 출력을 stringbuilder 써보자..?..왜?
			for(int el : resultStack) {
				sb.append(el + " ");
			}
			sb.append("\n");
			return; // 끝내기
		}
		 
		// 반복조건
//		int start = 0;
		for(int i = 0; i < n; i++) {
			
//			if(visited[i] == 0) {
				
				// 선택
				resultStack.add(arr[i]);
//				visited[i] = 1;
				// 재귀호출
				permutationWithRepetition();
				// 취소
				resultStack.pop();	
//				visited[i] = 0;
//			} 
		}
		
		
	}//permutation
	
}//class
