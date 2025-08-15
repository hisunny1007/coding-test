
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		
		
		for(int t = 0; t < 10; t++) {
			int tc = sc.nextInt();
			// 배열 이용
			int[] arr = new int[8];
			
			for(int i = 0; i < 8; i++) {
				arr[i] = sc.nextInt();
			} // 배열 입력받음
			
			int subtract = 1;
			
			// 맨 앞에꺼를 맨 뒤로 넣기
			while(true) {
				

				// arr[0]에서 subtract 빼기
				int first = arr[0] - subtract;
				
				// 나머지 왼쪽으로 밀기
				for(int j = 0; j < 7; j++) {
					arr[j] = arr[j+1];
				}
				

				// 종료조건 판단
				// 새로운 값이 뒤로 들어갈 때!! 조건 잘 확인해야 함
//				if(arr[7] <= 0) 검사  여기서는 first가 아니라 밀린 뒤의 값을 검사하게 됨
//				그 다음에 arr[7] = first 대입
				// arr[7]은 왼쪽으로 밀기 후의 값이라 안됨. 새로운 first 값으로 판단해야 함
				// 0보다 작거나 같으면 끝냄
				if(first <= 0) {
					arr[7] = 0;
					break;
				} else { // arr[0]을 맨 뒤로 옮기기
					arr[7] = first;
				}
				
				subtract = (subtract % 5) + 1;
				
				
			} // while e
			
			System.out.print("#" + tc + " ");
			for(int a : arr) {
				System.out.print(a + " ");
			}
			System.out.println();
			
		}// 테케 e

	}// 메인 e
}// 클래스 e
