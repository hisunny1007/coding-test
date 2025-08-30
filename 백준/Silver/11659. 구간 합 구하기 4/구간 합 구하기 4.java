
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int m = sc.nextInt();
		
        int[] num = new int[n + 1];   // 원본 배열 (1-based)
        int[] acc = new int[n + 1];   // 누적합 배열

        for (int i = 1; i <= n; i++) {
            num[i] = sc.nextInt();
            acc[i] = acc[i - 1] + num[i];  // 누적합 동시에 계산
        }

		
//		System.out.println(Arrays.toString(num));
//		System.out.println(Arrays.toString(acc));
//		[0, 5, 4, 3, 2, 1]
//		[0, 5, 9, 12, 14, 15]
		

		// i번째 부터 j 번째까지 구간합 구하기
        for (int k = 0; k < m; k++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            
            int ans = acc[j] - acc[i - 1];
            // 2번째부터 4번째까지 합 (4+3+2=9)
            // acc[4] - acc[1] (14 -5 = 9)
            System.out.println(acc[j] - acc[i - 1]);
        }

		sc.close();
	}//
}//
