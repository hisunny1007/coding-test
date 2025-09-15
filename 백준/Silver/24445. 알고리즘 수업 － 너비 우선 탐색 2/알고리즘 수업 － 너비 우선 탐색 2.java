
import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 정점의 수
		int m = sc.nextInt(); // 간선의 수
		int r = sc.nextInt(); // 시작정점
		
		// 그래프 초기화(인접리스트로 구현)
//		1 - 4 ,2
//		2 - 1, 3 , 4
//		3 - 2, 4
//		4 - 1, 2, 3
//		List<List<Integer>> graph = new ArrayList<>(); // 데이터 조회할 때는 배열이 더 빠르기 때문에.... 
		List<Integer>[] graph2 = new ArrayList[n+1]; // 정점의 수가 정해져있으면 배열
		// 유연하다고 다 좋은게 아님! n이 정해져있으니까! 그럼 배열로 쓰면 조회가 빠름
		
//		System.out.println(Arrays.toString(graph2)); [null, null, null, null, null, null]

		// 정점은 1번부터n번까지
		for(int i = 1; i < n+1; i++) {
			graph2[i] = new ArrayList<>();
		}
//		System.out.println(Arrays.toString(graph2)); [null, [], [], [], [], []]
		
		
		// 간선 정보 추가
		for(int i = 0; i < m; i++) {
			int u = sc.nextInt();
			int v = sc.nextInt();
			
			// 양방향 간선			
			graph2[u].add(v);
			graph2[v].add(u);
		}
		
//		System.out.println(graph2); // [[], [4, 2], [1, 3, 4], [2, 4], [1, 2, 3]]
		
		// 정점 번호 내림차순 해야 함		
		for(int i = 1; i < n + 1; i++) {
			Collections.sort(graph2[i], Collections.reverseOrder());
		}
//		System.out.println(Arrays.toString(graph2)); [null, [4, 2], [4, 3, 1], [4, 2], [3, 2, 1], []]

		// bfs 큐 활용
		Queue<Integer> queue = new ArrayDeque<>();
		
		boolean[] visited = new boolean[n+1];
		
		visited[r] = true;
		queue.add(r);
		
		int[] arr = new int[n+1];
		int idx = 1;
//		1 4 2 3
		while(!queue.isEmpty()) {
			int num = queue.poll(); // 기준 노드
			
			arr[num] = idx++;
			// 기준 노드 옆에 인접 노드들을 살
			for(int i = 0; i < graph2[num].size(); i++) {
				int nextNode = graph2[num].get(i);
				if(!visited[nextNode]) {
					visited[nextNode] = true;
					queue.add(nextNode);
				}
			}
		}
		
//		System.out.println(Arrays.toString(arr)); [0, 1, 3, 4, 2, 0]
//		1번정점은 순서 1번, 2번 정점은 3번, 3번 정점은 4번, 4번 정점은 2번,,
		for(int i = 1; i <= n; i++) {
			System.out.println(arr[i]);
		}
		
		sc.close();
	}//
}//
