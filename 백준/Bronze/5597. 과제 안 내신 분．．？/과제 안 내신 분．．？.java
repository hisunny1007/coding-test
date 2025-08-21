import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[31]; // 1번 ~ 31번이니까
		
		// 카운트 배열 만들어야 함
		int[] count = new int[31];
		
		for(int i = 0; i < 28; i++) {
			int num = sc.nextInt(); // 학생 번호
			count[num]++; // 학생 번호를 인덱스로!
		}		
//		System.out.println(Arrays.toString(count));
//		[0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1]

		int answer = 0;
		
		// 카운트 배열의 값이 0인 인덱스가 정답
		// 1번부터! 0번은 무시
		for(int i = 1; i < count.length; i++) {
			if(count[i] == 0) {
				answer = i;
				System.out.println(answer); // 안 낸 사람 2명
			}
		}
		
		sc.close();
	}//
}//