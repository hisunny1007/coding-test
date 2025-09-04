import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
	
		// ( ) 대칭적으로 존재해야 함
		// (())()) -> no
		// ((())) -> yes

		// '(' : push
		// ')'
		// 1. 스택이 비어있지 않을 때는 스택 pop (스택 안에 있던 '(' 삭제)
		// 2. 스택이 비어있다면 이미 대칭이 아님
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		
		for(int tc = 0; tc < n; tc++) {
			String str = sc.next();
			Stack<Character> stack = new Stack<>(); // 테케마다 초기화
			boolean isValid = true; // 

			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				
				// 여는 괄호면 스택에 넣기
				if(ch == '(') {
					stack.add(ch);					
				} else { // 닫는 괄호면
					// 스택이 비어있지 않다면 (= 여는 괄호 있다면) pop
					// 스택이 비었다면 (=닫는 괄호만 있는 거니까) 대칭x
					if(!stack.isEmpty()) {
						stack.pop();
					} else { //더 볼 필요도 없이 끝
						isValid = false;
						break;
					}					
				}
			}//문자열 반복for문
			
			// 반복 종료 후 스택에 여는 괄호 남아있다면 대칭x
			// 스택 비었다면 대칭o
			if(isValid && stack.isEmpty()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
			
		}//tc
		
		sc.close();
		
	}//
}//
