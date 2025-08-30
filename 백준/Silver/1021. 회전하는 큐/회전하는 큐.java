
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 큐 크기
		int m = sc.nextInt(); // 뽑으려는 개수
		
		LinkedList<Integer> queue = new LinkedList<>(); // LinkedList로 큐 규현하면 addfirst addlast가능
		
		// n은 자연수 (0 x)
		for(int i = 1; i <= n; i++) {
			queue.add(i);
		}

		int count = 0;
//		System.out.println(middle);
		//2 9 5
		// 뽑는 행위 : 무조건 첫 번째 원소 뽑음
		// 왼쪽 한 칸 이동 (맨 앞 원소 -> 맨 뒤로)
		// 오른쪽 한 칸 이동 (맨 뒤 원소 -> 맨 앞으로)
		
		// 큐에서 num을 뽑는데 드는 2,3번 연산 최솟값 출력
		// 왼쪽 한칸 이동, 오른쪽 한 칸 이동밖에 안됨.
		// 2를 뽑으려면 왼쪽 한칸이 유리
		// 9를 뽑으려면 오른쪽 한칸이 유리
		// 그럼 큐 크기의 중간값으로 나눠서 중간값보다 작으면 왼쪽 한칸 이동 연산 / 크면 오른쪽 한칸 이동 연산
		// 중간값도 매번 다시 계산해야 함 (poll()이나 add() 하면서 크기 바뀌니까)
		for(int i = 0; i < m; i++) {
			int num = sc.nextInt();
			
			// 뽑아야할 원소 num이 맨 앞으로 올때까지 회전
			while(queue.peek() != num) {
				// 큐가 회전하면서 위치 바뀌니까
				int idx = queue.indexOf(num); // 원소 그 자체를 보는 게 아니라 원소의 현재 인덱스랑 비교해야 함
				int middle = queue.size() / 2; // 뽑기 연산하기 때문에!!! 매번 크기 변함
				
				if(idx <= middle) {
					// 왼쪽 회전 (맨 앞 -> 맨 뒤)
					queue.add(queue.poll());
					count++;
				} else { 
					// 오른쪽 회전 (맨 뒤 -> 맨 앞)
					queue.addFirst(queue.pollLast());
					count++;
				}
			}
			
			queue.poll(); // queue.peek() == num이면 값 빼버리기
		}//tc

		System.out.println(count);
		sc.close();
	}//
}//
