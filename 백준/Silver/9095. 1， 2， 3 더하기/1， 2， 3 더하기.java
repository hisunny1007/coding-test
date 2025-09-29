import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int t = sc.nextInt(); // 테스트 케이스 수

        // dp 배열 초기화 (최대 n은 10)
        
        int[] dp = new int[11];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;

        // dp 배열 채우기
        for (int i = 4; i <= 10; i++) {
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        }

        // 테스트 케이스 처리
        for (int tc = 0; tc < t; tc++) {
            int n = sc.nextInt();
            System.out.println(dp[n]);
        }
		
		sc.close();
	}
}
// 1 (1) / 2 (1+1, 2) 3(1+1+1, 1+2, 2+1, 3) 4(1+1+1+1, 1+1+2, 1+2+1, 2+1+1, 2+2, 1+3, 3+1)