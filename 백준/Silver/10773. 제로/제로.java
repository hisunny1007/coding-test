import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		// 스택 만들기
		Stack<Integer> stack = new Stack<>();
		
		
		
		for(int tc = 0; tc < t; tc++) {
			int num = sc.nextInt();
						
			// 근데 부르는 게 0일 경우 최근에 쓴 수 지우기
			if(num == 0) {
				stack.pop();
			} else {
				stack.push(num);
			}
		}//

		// 합계 구하기
		int sum = 0;
		
		for(int i = 0; i < stack.size(); i++) {
			sum += stack.get(i);
		}
		
		System.out.println(sum);
		
		
		sc.close();
	}//
}//