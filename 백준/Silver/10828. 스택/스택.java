import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Stack<Integer> stack = new Stack<>();
		
		int n = sc.nextInt();
        sc.nextLine(); // 남아 있는 줄바꿈(\n) 제거
		
		
		for(int i = 0; i < n; i++) {
			// 한 줄로 받고 공백에서 자르기
			String[] line = sc.nextLine().split(" ");//
//			System.out.println(Arrays.toString(line)); [push, 1]
			
			String order = line[0];
//			int num = Integer.parseInt(line[1]); // 숫자가 없는 push 제외 연산들은 ArrayIndexOutofBoundsException
			
			// push, pop, size, empty, top일 경우
			// line의 원소가 두 개일때 조심해야 함!! 그래서 그떄 경우만 체크
			// 문자열이니까 == 못쓰고 .equals()
//			if(order.equals("push")) {
//				int num = Integer.parseInt(line[1]);
//				stack.push(num);
//			} else if (order.equals("pop")) {
//				if (stack.isEmpty()) {
//					System.out.println(-1);
//				} else {
//					System.out.println(stack.pop());
//				}
//			} else if (order.equals("size")) {
//				System.out.println(stack.size());
//			} else if (order.equals("empty")) {
//				if (stack.isEmpty()) {
//					System.out.println(1);
//				} else {
//					System.out.println(0);
//				}
//			} else if (order.equals("top")) {
//				if (stack.isEmpty()) {
//					System.out.println(-1);
//				} else {
//					System.out.println(stack.peek());
//				}
//			}
			
			// switch-case문 이용
			switch(order) {
				case "push":
					int num = Integer.parseInt(line[1]);
					stack.push(num);
					break;	
				case "pop":
			        System.out.println(stack.isEmpty() ? -1 : stack.pop());
					break;
				case "size":
					System.out.println(stack.size());
					break;
				case "empty":
					System.out.println(stack.isEmpty() ? 1 : 0);
					break;
				case "top":
					System.out.println(stack.isEmpty() ? -1 : stack.peek());
					break;
			}
		
		}
		
		sc.close();
	}//main
}// class
