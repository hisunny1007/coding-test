import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int multiple = 1;
		
		// 세 개의 숫자를 입력받아 곱셈
		for(int i = 0; i < 3; i++) {
			int num = sc.nextInt();
			multiple *= num;
		}
				
		// 곱셈 결과를 문자열로 변환
		String str = Integer.toString(multiple);
		
	     // 숫자 카운트 배열 초기화 (0부터 9까지)
        int[] count = new int[10];  // 0~9까지 숫자를 카운트할 배열
        
        // 각 자리 숫자를 확인하고 카운팅
        for(int i = 0; i < str.length(); i++) {
//			count[arr[i]]++; // arr[i]은 char 타입인데 count배열 인덱스 사용하려면 숫자로 변환해야 함
            int digit = str.charAt(i) - '0';  // 문자 '0'을 빼서 숫자 값으로 변환
            count[digit]++;  // 해당 숫자 인덱스의 카운트 증가
        }

		// 출력하기
        for(int i = 0; i < count.length; i++) {
        	System.out.println(count[i]);
        }
		
		
		sc.close();
	}//
}//
