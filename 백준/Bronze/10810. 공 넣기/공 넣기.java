import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 바구니
		int n = sc.nextInt();
		
		int m = sc.nextInt();
		
		// 바구니 배열 만들기
		int[] arr = new int[n+1]; // 1번부터 시작하니까 (1번 ~ N번)
		
		
		for(int t = 0; t < m; t++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			// i~j번 바구니에 k번 공 넣기
			for(int idx = i; idx <= j; idx++) {
				arr[idx] = k;
			} // 바구니에 공이 있는 경우에도 새롭게 바뀜
			
		}
		
		// 0번 인덱스는 무시
		for(int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		

		sc.close();

	}//
}//
