import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int cnt = 0;
		
		for(int i = 0; i < n; i++) {
			int num = sc.nextInt();
			boolean isPrime = true;
			
			// 1은 소수가 아님
			if(num < 2) continue;
			
			
			for(int j = 2; j < num; j++) {
				if(num % j == 0) {
					isPrime = false;
					break;
				}
			}
			
			if(isPrime) {
				cnt++;
			}
		}
		
		System.out.println(cnt);
		sc.close();
	}
}
