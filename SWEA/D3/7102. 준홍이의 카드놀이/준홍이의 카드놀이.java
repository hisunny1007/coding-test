import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// 2시 45분
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc = 1; tc <= t; tc++) {
		
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			// 합 배열 만들어줌 // 최대 N + M까지 나올 수 있음
			// n = 6 / 1 2 3 4 5 6
			// n = 4 / 1 2 3 4
			int[] cntArr = new int[n+ m + 1]; // 0번부터이니까 + 1 해줘야 함
//			System.out.println(Arrays.toString(cntArr));
//			[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
//			[0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]

			// 인덱스 활용함
			// 인덱스 값(=카드 번호)이 몇 번 나왔는지!
			for(int i = 1; i < n + 1; i++) {
				for(int j = 1; j < m + 1; j++) {
					cntArr[i + j]++;
				}
			}
			
			// 최대값 구해야 함( 등장할 확률이 가장 높은 숫자)
			int max = Integer.MIN_VALUE;
			
			for(int i = 0; i < cntArr.length; i++) {
				if(cntArr[i] > max) {
					max = cntArr[i];
				}
			}
			
			// 결과 출력
			System.out.print("#" + tc + " ");
			// 만약에 여러 개라면 오름차순 정렬
			for(int i = 0; i < cntArr.length; i++) {
				if(cntArr[i] == max) {
					System.out.print(i + " ");
				}
			}
			System.out.println(); // 테케마다 줄 바꿈
						
		} // 테스트케이스 e

		sc.close();
		
	} // 메인 e
} // 클래스 e