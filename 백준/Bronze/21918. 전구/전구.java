import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
		int[] arr = new int[n + 1]; // 1 ~ n
		
		for(int i = 1; i <= n ; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 전구
		for(int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if(a == 1) {
				// b - i, c - x (i번째를 x로 변경)
				arr[b] = c;
			} else {
				// b - l, c- r
				for(int j = b; j <= c; j++) {
					if(a == 2) {
						arr[j] = 1 - arr[j];						
					} else if(a == 3) {
						arr[j] = 0;
					} else if(a == 4) {
						arr[j] = 1;
					}
				}
			}
		}
				
		for(int i = 1; i <= n; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
	}
}