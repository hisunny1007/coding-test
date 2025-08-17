import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc = 1; tc <= t; tc++) {
			String s = sc.next();
			
			int count = 0;
			
			// 일단 문자 하나씩 뜯기
			for(int i = 0 ; i < s.length() - 1; i++) {
				
				// substring : 문자열에서 일부 구간을 잘라서 새로운 문자열로 반환
				// substring(시작인덱스 포함o, 끝 인덱스 포함x)
				// 한 글자만 뽑고 싶으면 substring(i, i+1)
				// 연속된 패턴 체크할 때 유용
				String two = s.substring(i, i+2); // 두 글자씩 뽑기
				
				if(two.equals("()") || two.equals("(|") || two.equals("|)")) {
					count++;
				}
			}// 문자열 e
			
			System.out.println("#" + tc + " " + count);
			
			
		}// test case e
		
	}//main e
}//class e