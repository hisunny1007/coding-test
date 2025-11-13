import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();

		// 분을 초로 바꿔서 계산
		int[] button = {300, 60, 10};
		
		// 버튼을 누른 횟수의 합이 최소가 되어야 함
		// 큰 값으로 먼저 
		int[] cnt = new int[3];
		
		 
		for(int i = 0; i < button.length; i++) {
			if(t < button[i]) continue;
			
			// 시간 세는 카운트 배열
			cnt[i] = t / button[i];
			t %= button[i];
		}
		
		// 3개의 버튼으로 t초 맞출 수 없으면 -1 출력
		if(t % 10 != 0) {
			System.out.println(-1);
		} else {
			for(int c : cnt) {
				System.out.print(c + " ");
			}
		}
		
		sc.close();
	}
}