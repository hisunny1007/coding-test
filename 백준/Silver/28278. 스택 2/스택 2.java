
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
	public static void main(String[] args) throws IOException {
		
//		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		// 스택 구현 - arraydeque 이용
		Deque<Integer> stack = new ArrayDeque<>();
		
		//br.readLine() - string임
		int n = Integer.parseInt(br.readLine()); // 명령 개수
		
		for(int i = 0; i < n; i++) {
			String[] parts = br.readLine().split(" "); // 
			String cmd = parts[0];
			
			switch(cmd) {
				case "1":
					stack.add(Integer.parseInt(parts[1]));
					break;
				case "2":
					System.out.println(!stack.isEmpty() ? stack.pollLast() : -1);
					break;
				case "3":
					System.out.println(stack.size());
					break;
				case "4":
					System.out.println(stack.isEmpty() ? 1 : 0);
					break;
				case "5":
					System.out.println(!stack.isEmpty() ? stack.peekLast() : -1);
					break;
			}
					
		}
	}//
}//
