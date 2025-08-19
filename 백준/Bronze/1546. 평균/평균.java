import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 과목 개수 n
		double[] score = new double[n]; // 기존 점수 배열
		// double로 해야함(소수점 계산 위해)


		// 기존 점수 중 최댓값
		double m = 0;
		
		// 합
		double sum = 0;
		
		
		// 기존 점수 배열에서 최댓값 구하기
		for(int i = 0; i < n; i++) {
			score[i] = sc.nextInt();
		
			if(score[i] > m) {
				m = score[i];
			}
		}//

		
		// 새로운 점수 변환 후 합계
		for(int i = 0; i < n; i++) {
			score[i] = (score[i] / m) * 100;
			
			sum += score[i];
		}
		
		// 평균 구하기
		double avg = sum / n;
		
		System.out.println(avg);

		sc.close();
	}
}
//
//과목의 개수 n
//현재 성적에서 최댓값을 구하기 m
//모든 점수를 점수/m*100으로 바꾸고 평균 구하기
//
//1. 성적 배열 만들기 (크기 n)
//2. 성적 배열에서 최댓값 m 구하기
//3. 성적 배열에서 하나식 뽑아서 새롭게 점수 구하고
//4. 평균 구하기 // 소수점도 있으니까 double로 