import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 바구니 개수
		int m = sc.nextInt(); // 테스트케이스 개수
		
		// 1번~ n번 바구니
		int[] arr = new int[n+1]; // 0번 인덱스는 무시
		
		// 바구니 번호를 배열에 저장 (0은 사용하지 않고 1부터 n까지)
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
//		System.out.println(Arrays.toString(arr)); [0, 1, 2, 3, 4, 5]]
		
		// 바구니의 순서 역순으로 만들기 (m번 진행)
		// start바구니부터 end바구니의 순서를 역순으로
		
		// 예를 들어 start = 1, end = 4이면
		// 기존 arr [0, 1, 2, 3, 4, 5]
		// 결과 arr [0, 4, 3, 2, 1, 5]
		
		// 임시배열 tmp 만들어서
		// 바꿔야할 부분을 복사하자!!!
		// tmp = [1, 2, 3, 4]
		
		for(int tc = 0; tc < m; tc++) {
			int start = sc.nextInt();
			int end = sc.nextInt();
			
			// 1. 임시배열 tmp에 구간 복사
			int[] tmp = new int[end-start + 1]; // [0, 0, 0, 0]
			// 바꿔야할 부분을 복사하자!
			for(int i = 0; i < tmp.length; i++) {
				tmp[i] = arr[start + i];
			} // tmp = [1, 2, 3, 4]
			
			// 2. tmp를 거꾸로 arr에 넣어주기 
			for(int i = end; i >= start; i--) {
				arr[i] = tmp[end - i];
			}// arr[4] = tmp[4-4] 
			// arr[3] = tmp[4-3]..		
//			tmp를 순서대로 꺼내 arr 뒤쪽부터 채움 -> 결과적으로 구간이 역순이 됨
		}
		
		for(int i = 1; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		
		sc.close();

	}//
}//

// 1. 바구니 번호를 배열에 넣어둔다.
//2. 각 명령마다 start~end 구간을 tmp 배열에 복사한다.
//3. tmp를 꺼내서 arr에 거꾸로 덮어씌운다.
//4. M번 반복한 뒤 출력.
//즉, 핵심은 "start~end 구간을 복사 → tmp → 역순으로 다시 집어넣기"