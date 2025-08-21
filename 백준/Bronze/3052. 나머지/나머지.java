import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		// 나머지값을 인덱스로 하는 카운트 배열 만들기
		// 일단 42로 나눴을 때니까 41까지 나머지가 생길 수 있겠지
		int[] arr = new int[42]; // 0부터 41 인덱스 필요
		
		for(int i = 0; i < 10; i++) {
			int num = sc.nextInt();
			int idx = num % 42; // 나머지를 배열의 인덱스로
			arr[idx]++;
		}
		
		// 나머지를 인덱스로 하는 배열
//		System.out.println(Arrays.toString(arr));
		
		// 개수
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > 0) {
				count++;
			}
		}
		
		System.out.println(count);
		
		sc.close();
	}//
}//
