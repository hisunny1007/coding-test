import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 학생 n명
		int k = sc.nextInt(); // 최대 k명까지 한 방
		
		// 7 * 2 행렬 만들기 [학년][성별]
		int[][] arr = new int[7][2];  // [6][2]면 arr[grade-1]해줘야함
		
		//  여  남
		//0 무시하기 (값 바로 넣기 위해 7로 만듦)
		//1
		//2
		//3
		//4
		//5
		//6
	
		
		for(int t = 0; t < n; t++) {
			// (gender, grade) 좌표
			int gender = sc.nextInt(); // 성별 / 0 = 여, 1 = 남
			int grade = sc.nextInt(); // 학년 / 1 ~ 6

			// 굳이 행렬 돌면서 다 확인할 필요 없음
			arr[grade][gender]++;
		}// 값 입력받기
		
		int room = 0;
		
		for(int i = 1; i < arr.length; i++) { // 1학년부터
			for(int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] != 0) {
					if(arr[i][j] % k == 0) {
						room += arr[i][j] / k;
					} else {
						// 예를 들어 arr[i][j] = 7, k = 2이면
						room += arr[i][j] / k; // 몫도 더하고
//						room += arr[i][j] % k; // 나머지도 더하기  // 나머지 값 전체를 더하는 게 아니라 
						// 나머지가 0이 아니면 1 더하는 거임!!
						// 값이 11이고 k = 3이면
						// 몫 3 (방3개) + 나머지 2 (방1개)
						room ++; // 나머지 0이 아니니까 1 더하기
						// "몫 + (나머지가 있으면 1)"
					}
				}
			}//
		}//
		
		System.out.println(room);

		sc.close();
	}//
}//