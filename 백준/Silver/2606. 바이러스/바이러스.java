
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 컴퓨터의 수 (정점의 개수)
		int m = sc.nextInt(); // 간선 개수
		
		//인접리스트로 그래프 구현
		List<List<Integer>> graph = new ArrayList<>();
		// 1번 컴퓨터부터 n번 컴퓨터까지
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}
	
		// 간선 정보 입력받고 그래프에 추가
		for(int i = 0; i < m; i++) {
			int v1 = sc.nextInt();
			int v2 = sc.nextInt();
			
			graph.get(v1).add(v2);
			graph.get(v2).add(v1);
		}
//		System.out.println(graph);
//		[[], [2, 5], [1, 3, 5], [2], [7], [1, 2, 6], [5], [4]]

		boolean[] visited = new boolean[n + 1];
		
		// bfs 큐
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(1);
		visited[1] = true;
		
		while(!queue.isEmpty()) {
			// 현재 내가 방문한 노드 (큐에서 뺌)
			int node = queue.poll();
			
			// 큐에서 뺀 방문 정점 기준으로 인접한 노드 확인
			for(int nextNode : graph.get(node)) {
				if(!visited[nextNode]) {
					visited[nextNode] = true;
					queue.add(nextNode);
				}
			}
		}
		// 1번 컴퓨터는 안 셈
		int count = 0;
		for(boolean v : visited) {
			if(v) count++;
		}
		System.out.println(count - 1);
		
		sc.close();
	}//
}//
