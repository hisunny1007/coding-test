import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = new int[9][9];
		
		// 1행부터 시작
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}//이차원 배열 입력받음
		
//		System.out.println(Arrays.deepToString(arr));
		
		int max = Integer.MIN_VALUE;
		
		int r = 0;
		int c = 0;
		
		// 그 맥스값의 행 렬 위치 구해야 함.
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				
				if(arr[i][j] > max) {
					max = arr[i][j];
					r = i + 1; // 1행 1열부터니까
					c = j + 1;
				}
			}
		}
		
		System.out.println(max);
		System.out.printf("%d %d", r, c);
		
		sc.close();
	}
}