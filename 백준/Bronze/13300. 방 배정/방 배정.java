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
	
		int room = 0;
		
		for(int t = 0; t < n; t++) {
			// (gender, grade) 좌표
			int gender = sc.nextInt(); // 성별 / 0 = 여, 1 = 남
			int grade = sc.nextInt(); // 학년 / 1 ~ 6

			// 굳이 행렬 돌면서 다 확인할 필요 없음
			arr[grade][gender]++;
		}
		
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[0].length; j++) {
				if(arr[i][j] != 0) {
					if(arr[i][j] % k == 0) {
						room += arr[i][j] / k;
					} else {
						room += arr[i][j] / k;
						room += arr[i][j] % k;
					}
				}
			}//
		}//
		
		System.out.println(room);

		sc.close();
	}//
}//