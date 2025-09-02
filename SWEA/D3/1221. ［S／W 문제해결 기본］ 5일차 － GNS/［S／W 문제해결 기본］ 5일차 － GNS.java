import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();

		for(int tc = 1; tc <= 10; tc++) {
			
			String tcNum = sc.next(); // #1
			int n = sc.nextInt(); // 7041
			
			// 문자열 배열 만들기
			String[] stringArr = new String[n];
			
			// 카운트 배열 만들기
			int[] count = new int[10]; // 0 ~ 9
			
			for(int i = 0; i < n; i++) {
				stringArr[i] = sc.next();

				switch (stringArr[i]) {
					case "ZRO":
						count[0]++;
						break;
					case "ONE":
						count[1]++;
						break;
					case "TWO":
						count[2]++;
						break;

					case "THR":
						count[3]++;
						break;

					case "FOR":
						count[4]++;
						break;

					case "FIV":
						count[5]++;
						break;

					case "SIX":
						count[6]++;
						break;

					case "SVN":
						count[7]++;
						break;

					case "EGT":
						count[8]++;
						break;

					case "NIN":
						count[9]++;
						break;

				}//switch
			}//반복문
						
				
			// 출력
			System.out.println(tcNum);
			for(int k = 0; k < count[0]; k++) {
				System.out.print("ZRO" + " ");
			}
			for(int k = 0; k < count[1]; k++) {
				System.out.print("ONE" + " ");
			}
			for(int k = 0; k < count[2]; k++) {
				System.out.print("TWO" + " ");
			}
			for(int k = 0; k < count[3]; k++) {
				System.out.print("THR" + " ");
			}
			for(int k = 0; k < count[4]; k++) {
				System.out.print("FOR" + " ");
			}
			for(int k = 0; k < count[5]; k++) {
				System.out.print("FIV" + " ");
			}
			for(int k = 0; k < count[6]; k++) {
				System.out.print("SIX" + " ");
			}
			for(int k = 0; k < count[7]; k++) {
				System.out.print("SVN" + " ");
			}
			for(int k = 0; k < count[8]; k++) {
				System.out.print("EGT" + " ");
			}
			for(int k = 0; k < count[9]; k++) {
				System.out.print("NIN" + " ");
			}
							

		}//tc
		sc.close();
	}//main
}//class