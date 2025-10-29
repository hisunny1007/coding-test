import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 int t = sc.nextInt();
		 
		 for(int tc = 1; tc <= t; tc++) {
			 String str = sc.next();
			 
			 int cnt = 0;
			 char current = '0';
			 
			 for(int i = 0; i < str.length(); i++) {
				if(str.charAt(i) != current) {
					cnt++;
					current = str.charAt(i);
					
				}
			 }
			 System.out.println("#" + tc + " " + cnt);
		 }
		 sc.close();
	}
}