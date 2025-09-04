import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// 1 ~ n인 덱 만들기 (양방향 삽입, 삭제 가능)
		Deque<Integer> queue = new LinkedList<>(); // 사고다.. 큐는 인터페이스임..

		// 1번이 제일 위에, n번이 제일 아래
		for(int i = n; i >= 1; i--) {
			queue.add(i);
		}
		
		// 카드 한 장 남을 때까지 반복
		while(!(queue.size() == 1)) {
			// 1. 맨 위 카드 버리기
			queue.pollLast();

			// 2. 맨 위 카드를 제일 아래에 넣기
			queue.addFirst(queue.pollLast());
		}
		
		// 출력
		for(int q : queue) {
			System.out.println(q);
		}
		
		sc.close();
	}//
}//
