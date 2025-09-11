import java.util.Scanner;

public class Main {
	
	static int n;
	static int m;
	static int[] parent;
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt(); // 0부터 n (정점 수)
		m = sc.nextInt(); // 쿼리 수
		parent = new int[n + 1];
		
		// parent 배열 초기화 (자기 자신을 부모로 설정)
		for(int i = 1; i <= n; i++) {
			parent[i] = i;
		}
		
		// m줄에 걸쳐 입력받기
		// 쿼리를 저장할 필요 없이 바로 처리 가능
		for(int i = 0; i < m; i++) {
			int cmd = sc.nextInt(); // 0 or 1
			int a = sc.nextInt(); 
			int b = sc.nextInt();
			
			// cmd가 0이면 union, 1이면 find
			if(cmd == 0) {
				union(a, b);
			} else {
				// 두 원소가 같은 집합에 속해있다면
				if(find(a) == find(b)) {
					System.out.println("yes");
				} else {
					System.out.println("no");
				}
			}
		}
		
		sc.close();
	}//main
	
	// find: 루트 부모 찾기
	public static int find(int x) {
		if(x != parent[x]) {
			parent[x] = find(parent[x]);
		}
		return parent[x];
	}//
	
	// union: 두 집합 합치기
	public static void union(int x, int y) {
		// 루트 찾기 (x가 속한 집합과 y가 속한 집합을 조회)
		int rootX = find(x);
		int rootY = find(y);
		
		// 루트끼리 연결
		if(rootX != rootY) {
			parent[rootY] = rootX;
		}
	}//
	
}//