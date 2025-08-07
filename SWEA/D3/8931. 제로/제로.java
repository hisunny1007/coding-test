import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		
//		File file = new File("sample_input.txt");
//		Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		
		// 테스트케이스 수
		int TC = sc.nextInt();
		
		for(int tc = 1; tc <= TC; tc++) {
			// 정수 개수 K줄
			int K = sc.nextInt();
			
			// 숫자를 담을 수 있는 스택 만들기
			Stack<Integer> stack = new Stack<>();
			
			
			// K줄만큼 돈 입력받기
			for(int i = 0; i < K; i++) {
				int money = sc.nextInt();
				
				// 만약 money가 0이 아니면 부르는 수 그대로 push하고
				// money가 0이면 stack.pop()
				if(money != 0) {
					stack.push(money);
				} else {
					stack.pop();
				}
			}
				
//				System.out.println(stack);
				
			// 스택에 남아있는 원소들 합치기
			int sum = 0;
			
			// 스택이 비어있지 않을때까지 원소 pop해서 sum에 넣기
			while(!stack.isEmpty()) {
				sum += stack.pop();	
			}
			
			System.out.println("#" + tc + " " + sum );
		}
	}	
}

//부르는 수를 적고, 0을 부르면 마지막 수를 지움.
//=> Stack 이용하자
//Stack<타입> 변수명 = new Stack<>(); 