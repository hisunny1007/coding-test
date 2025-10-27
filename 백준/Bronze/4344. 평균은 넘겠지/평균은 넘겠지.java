import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc = 0; tc < t; tc++) {
			int n = sc.nextInt();
			
			int[] scores = new int[n];
			
			int sum = 0;
			double avg = 0;

			
			for(int i = 0; i < n; i++) {
				scores[i] = sc.nextInt();
				sum += scores[i];
			}				
			avg = sum / n;
			
//			평균을 넘는 학생들의 비율			
			double cnt = 0;
			
			for(int i = 0; i < n; i++) {
				if(scores[i] > avg) {
					cnt++;
				}
			}

			double answer = (cnt / n) * 100;
			
			// 반올림해서 소수점 셋째 자리까지 출력
			// %s 문자열 출력 / %n 줄바꿈
			System.out.printf("%.3f%s%n", answer, "%");
		}
		
		sc.close();
	}
}
