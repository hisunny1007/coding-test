import java.util.Scanner;
import java.util.Stack;

public class Main {
	static int n;
	static int m;
	static int[] arr;
	static boolean[] visited;
	static Stack<Integer> resultStack;
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); // 1 ~ n 자연수
		m = sc.nextInt(); // m개 고르기 (중복x)
		
		arr = new int[n]; // 길이가 n인 원본배열
		visited = new boolean[n]; // 길이가 n인 visited 배열
		resultStack = new Stack<>();
		
		for(int i = 0; i < n; i++) {
			arr[i] = i + 1;
		}
		
		permutation();
		
		sc.close();
	}//main
	
	// 1부터 N까지 자연수 중에서 M개를 고른 순열 (중복x)
	// permutation(int[] arr, boolean[] visited, Stack<Integer> resultStack)
	public static void permutation() {
		// 종료조건
		// m개 다 뽑았을 때
		if(resultStack.size() == m) { // resultStack의 크기가 m이랑 같을 때
//			System.out.println(resultStack); // [1, 2] [1, 3]
			for(int num : resultStack) {
				System.out.print(num + " ");
			}
			System.out.println();
			return; // 끝내기
		}
				
		// 재귀조건 (반복조건)
		// 원본배열의 길이만큼 반복 (배열의 모든 원소를 순회하며 다음 원소를 선택)
		for(int i = 0; i < n; i++) {
			// 방문하지 않았다면
			if(!visited[i]) {
				// 방문배열 true로 바꾸고 resultStack에 넣어주기 (뽑기)
				visited[i] = true;
				resultStack.add(arr[i]);
				
				// 재귀호출
				// permutation(arr, visited, resultStack);
				permutation();
				
				//  취소하기
				visited[i] = false;
				resultStack.pop();
			}
		}
	}//permutation
	
}//class
