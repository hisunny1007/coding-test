import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		//알파벳 배열
		// -1 로 초기화
		int[] arr = new int[26];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			int idx = ch - 'a'; 
//			System.out.println(ch + " " + idx);
			
			// 알파벳 배열 돌면서 값 변경
			for(int j = 0; j < arr.length; j++) {
				// 이미 한번 나온 값이라면 무시함
				if(arr[idx] != -1) {
					continue;
				}
				arr[idx] = i;
				
			}
		}
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
		sc.close();
	}
}
