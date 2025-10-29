import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		// 소수가 없을 경우 -1 출력 (소수가 하나라도 발견됐는지 체크해야 함)
		boolean found = false; // 소수 발견 여부 불리언 변수
		
		for(int i = m; i <= n; i++) {
			if(i < 2) continue;

			boolean isPrime = true;
			
			for(int j = 2; j < i; j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				found = true; // 소수 하나라도 찾음
				sum += i;

				if(i < min) {
					min = i;
				}
			}
		}
		
		if(found) { // 소수가 있으면
			System.out.println(sum);
			System.out.println(min);
		} else {
			System.out.println(-1);
		}
//		if (sum == 0) {
//			System.out.println(-1);
//		} else {
//			System.out.println(sum);
//			System.out.println(min);
//		}
		
		sc.close();
	}
}