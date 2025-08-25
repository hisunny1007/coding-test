import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 바구니 개수
		int m = sc.nextInt(); // 테스트케이스 개수
		
		int[] arr = new int[n + 1]; // 1번 바구니 ~ n번 바구니 (0번 인덱스는 무시)
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}// 바구니 번호를 배열에 저장 (0은 사용하지 않고 1부터 n까지)
		
//		System.out.println(Arrays.toString(arr));
		
		for(int tc = 0; tc < m; tc++) {
			int left = sc.nextInt(); // 왼
			int right = sc.nextInt(); // 오
			
			// 왼 바구니 <-> 오 바구니 값 바꾸기
			while(left <= right) {
				//ex. left = 1, right = 4
				// 기존 배열 [0, 1, 2, 3, 4, 5] 
				// 결과 배열 [0, 4, 3, 2, 1, 5]
				// 임시변수 이용해서 왼쪽 값, 오른쪽 값 바꾸기
				int tmp = arr[left];
				arr[left] = arr[right];
				arr[right] = tmp;
				
				left++;
				right--;
			}// while e
		}// for문 e
		
		for(int i = 1; i < arr.length; i++) {
			System.out.printf("%d ", arr[i]);
		}
		
	
		sc.close();
	}//
}//

// 바구니 n개(1번 바구니 ~ n번 바구니)
// 가장 왼쪽 1번 -> 오른쪽 n번

// m번 바구니의 순서를 역순으로 만들기
// i번째 바구니부터 j번째 바구니의 순서를 역순으로 만들기
// 바구니 출력

// 바구니 배열 만들기
//ex. [0, 1, 2, 3, 4, 5] left = 1, right = 4
//[0, 4, 3, 2, 1, 5]
// 인덱스 이용해서 값 바꾸기
//arr[4] <-> arr[1]
//arr[3] <-> arr[2] 