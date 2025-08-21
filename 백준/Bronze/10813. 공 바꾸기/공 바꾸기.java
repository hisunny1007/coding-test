import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// 바구니 1번 ~ n번 바구니
		int n = sc.nextInt();
		
		// m번 공 바꾸기
		int m = sc.nextInt();
		
		// 바구니 배열 만들기
		int[] arr = new int[n+1]; // 1번부터 시작하니까 (1번 ~ N번)
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
//		System.out.println(Arrays.toString(arr));
		// [0, 1, 2, 3, 4, 5]
		
		for(int t = 0; t < m; t++) {
			int i = sc.nextInt();
			int j = sc.nextInt();			
			
			// 교환할 때는 항상 임시변수를 쓰자!
//			arr[i] = arr[j];
//			arr[j] = arr[i];
			
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		for(int i = 1; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		sc.close();
		
	}//
}//
