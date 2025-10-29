import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc = 1; tc <= t; tc++) {
			int sum = 0;
			
			for(int i = 0; i < 10; i++) {
				int number = sc.nextInt();
				
				if(number % 2 != 0) {
					sum += number;
				}
			}
			System.out.println("#" + tc + " " + sum);
		}
		
		sc.close();
	}
}