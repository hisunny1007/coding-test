
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		// 온도 배열 만들기
		int[] temps = new int[n];
		
		for(int i = 0; i < n; i++) {
			temps[i] = sc.nextInt();
		}
		
		// 누적합 배열 만들기
		int[] acc = new int[n + 1]; // 0번은 무시 /  1번부터 n번까지
		for(int i = 0; i < n; i++) {
			acc[i + 1] = acc[i] + temps[i];
		}
		
		// k - 연속적인 날짜 수 (k개씩 확인해야 함)
		// n = 10
		// k =2 라면 1~2, 2~3, 3~4, 4~5, 5~6, 6~7, 7~8, 8~9, 9~10
		
		// k =5라면 1~5, 2~6, 3~7, 4~8, 5~9, 6~10
		
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i <= n - k ; i++) {
			int tmp = acc[i + k] - acc[i]; // 합 구하기
			
			max = Math.max(max, tmp);
		}

		System.out.println(max);
		sc.close();
	}//
}//
