import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// 중위 표기식 -> 후위 표기식
		// 연산자는 + 하나 뿐이며  (하나니까 우선순위 x)
		// 피연산자는 숫자인 0~9 정수

//		File file = new File("src/SWEA_1222_계산기1/input.txt");
//		Scanner sc = new Scanner(file);
		
		Scanner sc = new Scanner(System.in);
		
		// 테스트케이스 10개
		int T = 10;
		
		// 테케 s
		for(int tc = 0; tc < T; tc++) {
			// 계산식 길이
			int infixLength = sc.nextInt();
			// 계산식 (중위 표기식)
			String infix = sc.next();
			// char[] arr = sc.next().toCharArray();
			
			// [1. 후위 표기식으로 변환]
			// 연산자 담을 스택 만들어!!
			Stack<Character> stack = new Stack<>();
			// 후위 표기식 담을 최종 출력 결과
			StringBuilder postfix = new StringBuilder();
			
			// 계산식 돌면서 결과 구하기 s
			for(int i = 0; i < infixLength; i++) {
				char tmp = infix.charAt(i); // 하나씩 뜯어서 임시변수에 저장함!
				
				// 피연산자라면 (숫자) 
				if(tmp >= '0' && tmp <= '9') {
					postfix.append(tmp); // 출력하고
				} // 연산자라면 (+) 
				else {
					// 스택이 비어있다면 넣고
					if(stack.isEmpty()) {
						stack.push(tmp);
					} else { // 지금 스택에 + 있고 넣고싶은것도 +면 우선순위가 같잖아! 그러면 바로 push하는게 아님!
						// 넣으려는게 스택의 peek()보다 높을 때만 push할 수 있음. // 아닐 경우에는 pop
						// 근데 지금은 연산자 하나밖에 없으니까 어쨌든 스택에 있는 거 pop하고 출력					
						postfix.append(stack.pop());
						stack.push(tmp);
					}
				}
			} // 계산식 e
			
			// 스택이 비어있지 않을 때까지!
			// 스택에 남아있는 모든 연산자 pop하여 op.pop() => 출력 postfix.append()
			while(!stack.isEmpty()) {
				postfix.append(stack.pop());
			}

			// [2. 후위 표기식에서 계산 - 합 구하기]
			
			// 숫자를 담을 스택 만들기
			Stack<Integer> intStack = new Stack<>(); 
			
			// 계산식 s
			for(int i = 0; i < postfix.length(); i++) {
				char ch = postfix.charAt(i);
				
				// 피연산자라면 (숫자)
				if(ch >= '0' && ch <= '9') {
					intStack.push(ch - '0'); // - '0' 함으로써 문자'3'에서 숫자3이 됨 (아스키코드)
				} else { // 연산자라면 (+)
					int b = intStack.pop(); // 먼저 꺼낸거 (위에 있던 거)
					int a = intStack.pop(); //
					
					// 더하기
					intStack.push(a+b); // 순서 중요함! (아래 - 위)
					// 근데 이 문제에서는 더하기라 의미없긴 함
				}
			} // 계산식 e
			
			//System.out.printf("서식문자열", 값1, 값2, ...);
			System.out.printf("#%d %d\n", (tc+1), intStack.peek());
		} // 테케 e
		
		sc.close();
	}	
}	