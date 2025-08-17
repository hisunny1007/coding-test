import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
	
		int t = sc.nextInt();
		
		for(int tc = 1; tc <= t; tc++ ) {
			int n = sc.nextInt(); // 스위치 개수
			
			int[] switchA = new int[n]; // 조작 전
			int[] switchB = new int[n]; // 조작 후
			
			for(int i = 0; i < n; i++) {
				switchA[i] = sc.nextInt();
			}
			for(int i = 0; i < n; i++) {
				switchB[i] = sc.nextInt();
			}
			
//			System.out.println(Arrays.toString(switchA));
//			System.out.println(Arrays.toString(switchB));
			
			int count = 0;
			
			// 왼 -> 오 가면서 확인
			// 조작 전과 후가 다르다면
			// 그 스위치부터 끝까지 다 조작함
			for(int i = 0 ; i < n; i++) {
				
				if(switchA[i] != switchB[i]) { // 조작 전과 후가 다르면
					count++; // 개수 세고
					
					// i번째부터 n번까지 각자의 상태에서 바꾸기 (0->1 / 1->0)
					for(int j = i; j < n; j++) {
						
//						if(switchA[j] == 1) {
//							switchA[j] = 0;
//						} else {
//							switchA[j] = 1;
//						}
						
						switchA[j] = 1 - switchA[j]; // 0, 1이라서 한 번에 줄일 수 있음
//						switchA[j] = (switchA[j] == 0) ? 1 : 0;

					}
				}
			}// 스위치 배열 순회
			
			System.out.println("#" + tc + " " + count);
			
		}// test case e
		
		
		
		sc.close();
	}// main e
}// class e