
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		
		for(int tc = 1; tc <= t; tc ++) {
			int n = sc.nextInt();
			
			// 위치는 1부터임
//			예를 들어, {1, 1, 2, 3, 3} 가 주어지면 최대값의 위치는 5이고, 최소값의 위치는 1이다. 따라서 두 값 차이의 절대값은 4이다.
			int[] arr = new int[n + 1];
			
			
			for(int i = 1; i <= n; i++) {
				arr[i] = sc.nextInt();

			}
//			System.out.println(Arrays.toString(arr));
			
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;

			// 위치 (1부터)
			int maxIndex = 1;
			int minIndex = 1;
			
			//단, 가장 작은 수가 여러 개이면 먼저 나오는 위치로 하고
			// 가장 큰 수가 여러 개이면 마지막으로 나오는 위치로 한다.
			for(int i = 1; i <= n; i++) {
				if(arr[i] >= max) {
					max = arr[i];
					maxIndex = i;
				}
				
				if(arr[i] < min) {
					min = arr[i];
					minIndex = i;
				}
			}
			
//			int answer = Math.abs(maxIndex - minIndex);
			
			// 위치 차이 절대값
			int answer;
			if(maxIndex - minIndex < 0) {
				answer = minIndex - maxIndex;
			} else {
				// 양수일 때는 동일
				answer = maxIndex - minIndex;
			}
			
			
			System.out.printf("#%d %d\n", tc, answer);
			
		}//tc
		
		sc.close();
	}//
}//
