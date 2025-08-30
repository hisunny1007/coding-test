package SWEA_5097_회전;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solutoin {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc = 1; tc <= t; tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			Queue<Integer> q = new LinkedList<>();
			
			for(int i = 0; i < n; i++) {
				q.add(sc.nextInt());
			}
//			System.out.println(q); [5527, 731, 31274]
			
			// m번 회전
			// 맨 앞 숫자를 맨 뒤로 보냄
			for(int i = 0; i < m; i++) {
				q.add(q.poll());; // 맨 앞 숫자를 지우고 맨 뒤로 보냄 
//				System.out.println(q); [731, 31274, 5527]
			}
			
			System.out.printf("#%d %d\n", tc, q.peek());
		}//tc
		
		sc.close();
	}//
}//
