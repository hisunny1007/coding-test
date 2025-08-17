import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		
//		File file = new File("./src/SWEA_14555_공과_잡초/sample_input.txt");
//		Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc = 1; tc <= t; tc++) {
			String s = sc.next();
			
			int count = 0;
			
			// 일단 문자 하나씩 뜯기
			for(int i = 0 ; i < s.length() - 1; i++) {
				char c = s.charAt(i);
				char c1 = s.charAt(i+1);

		        // (|  경우
				if (c == '(' && c1 == '|') {
						count++;
				}
				
		        // |)  경우
				if (c == '|' && c1 == ')') {
					count++;
				}
				
		        // ()  경우
		        if (c == '(' && c1 == ')') {
		            count++;
		        }
				
			}// 문자열 e
			
			System.out.println("#" + tc + " " + count);
			
			
		}// test case e
		
	}//main e
}//class e