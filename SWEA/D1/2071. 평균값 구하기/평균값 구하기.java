import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc = 1; tc <= t; tc++) {
			int sum = 0;
			int avg = 0;
			
			for(int i = 0; i < 10; i++) {
				int num = sc.nextInt();
				
				sum += num;
				avg = (int) Math.round(sum / 10.0); // 하나라도 실수면 실수임 .. .
				// 10이 아니고 10.0 인위적으로 만들어 .. 
			}
			System.out.println("#" + tc + " " + avg);
		}
		
		sc.close();
	}
}