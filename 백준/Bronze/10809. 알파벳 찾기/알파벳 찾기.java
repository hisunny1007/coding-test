import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		// 알파벳 배열
		int[] arr = new int[26];
		// 초기값은 -1로 정함
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			int idx = ch - 'a';
//			System.out.println(idx);
			
			// 아직 한 번도 등장하지 않은 경우만 기록함
			if(arr[idx] == -1) {
				arr[idx] = i;		
			}
		}
		
		for(int num : arr) {
			System.out.print(num + " ");
		}
		
		sc.close();
	}
}