import java.io.File;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
//		File file = new File("./src/SWEA_1225_암호생성기/input.txt");
//		Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		
		
		for(int i = 0; i < 10; i++) {
			Queue<Integer> q = new LinkedList<>();

			int tc = sc.nextInt();

			for(int j = 0; j < 8; j++) {
				int input = sc.nextInt();
				q.offer(input);
			} // 큐 입력받음
			
//			System.out.println(q); 
			
			int subtract = 1;
			
			while(true) {
				
				// 맨 앞 꺼내기
				int num = q.poll();
				num -= subtract; // 1~5까지 뺼 거임
				
				// 0보다 작아지거나 0일 경우 0으로 뒤에 넣기
				if(num <= 0) { // 종료 조건
					q.offer(0); 
					break;
				}
				
				q.offer(num); // 그 뺸 값을 맨 뒤에다 넣기
				subtract = (subtract % 5) + 1; // 2 / 3 / 4 / 5 / -> 1 / 2 ... 1 ~ 5 반복
			}//while

			// 결과 출력
			System.out.printf("#%d ", tc);
			for(int el : q) {
				System.out.printf("%d ", el);
			}
			System.out.println(); // 줄바꿈
			
		}// 테케 e

	}// 메인 e
}// 클래스 e

