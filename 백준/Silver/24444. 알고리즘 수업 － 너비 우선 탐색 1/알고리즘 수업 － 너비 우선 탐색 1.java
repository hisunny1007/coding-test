import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 정점의 수
		int m = sc.nextInt(); // 간선의 수
		int r = sc.nextInt(); // 시작정점
		
        // 1. 그래프 초기화 (인접리스트)
		List<List<Integer>> graph = new ArrayList<>();
		// 정점은 1번부터 n번까지
		for(int i = 0; i <= n; i++) {
			graph.add(new ArrayList<>());
		}
		
        // 2. 간선 정보 추가 (양방향)
		for(int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			// 양방향 간선
			graph.get(u).add(v);
			graph.get(v).add(u);
		}
//		System.out.println(graph);
//		[[], [4, 2], [1, 3, 4], [2, 4], [1, 2, 3], []]
//		node = 1
//		graph.get(1) = [4,2]
        
		// 3. 인접 정점 오름차순 정렬
		// bfs 시작 전에 모든 리스트 정렬
		for(int i = 1; i <= n; i++) {
			Collections.sort(graph.get(i));
		}
//		System.out.println(graph);
//		[[], [2, 4], [1, 3, 4], [2, 4], [1, 2, 3], []]

        // 4. BFS 준비
		// 방문 순서를 알아야하기 때문에 visited 굳이 필요 없음 order로 가능
//        boolean[] visited = new boolean[n + 1]; // 방문 여부
		
        int[] order = new int[n + 1];           // 방문 순서 기록
        int cnt = 1;                             // 순서 카운터
		
		// bfs탐색
		Queue<Integer> queue = new ArrayDeque<>();
		
		queue.add(r);
		order[r] = cnt++;
		
        // 5. BFS 수행- 큐가 빌 때까지 탐색함
		while(!queue.isEmpty()) {
			int node = queue.poll(); // 현재 내가 방문한 노드

			// graph.get(node) -> (List<Integer>)
			for(int nextNode : graph.get(node)) {
				if(order[nextNode] == 0) { // 방문 안 했으면
					order[nextNode] = cnt++; // 방문 순서 기록
					queue.add(nextNode);
				}
			}
		}
		
//		System.out.println(Arrays.toString(order));
//		[0, 1, 2, 4, 3, 0]
//		1번정점은 순서 1번, 2번 정점은 2번, 3번 정점은 4번, 4번 정점은 3번,,
        // 6. 방문 순서 출력
        for (int i = 1; i <= n; i++) {
            System.out.println(order[i]);
        }
        
		sc.close();
	}//
}//
