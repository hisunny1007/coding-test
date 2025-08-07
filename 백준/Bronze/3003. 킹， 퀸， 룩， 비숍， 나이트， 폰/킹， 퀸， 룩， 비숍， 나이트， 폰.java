import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 원래 체스 배열
		int[] chess = {1, 1, 2, 2, 2, 8};
	
		// 새로운 체스 배열 입력받기
		int[] newChess = new int[6];
		
		for(int i = 0; i < newChess.length; i++) {
			newChess[i] = sc.nextInt();
		}
//		System.out.println(Arrays.toString(newChess)); // [0, 1, 2, 2, 2, 7]

		for(int i = 0; i < 6; i++) {
//			if(chess[i] > newChess[i] || chess[i] < newChess[i] ) {
//				newChess[i] = chess[i] - newChess[i];
//			} else { // 같은 경우는 0으로 만들기
//				newChess[i] = 0;
//			}
			// 어차피 차이를 계산하는 거니까 조건문 필요 없음
			newChess[i] = chess[i] - newChess[i];
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(newChess[i]+ " ");
		}
	}
}