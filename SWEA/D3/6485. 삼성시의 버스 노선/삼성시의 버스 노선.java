import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc = 1; tc <= t; tc++) {
			
			int[] busStop = new int[5001];
			
			int n = sc.nextInt();
			
			for(int i = 0; i < n; i++) {
				int start = sc.nextInt();
				int end = sc.nextInt();
				
				for(int j = start; j <= end; j++) {
					busStop[j]++;
				}
			}
			
//			System.out.println(Arrays.toString(busStop));
			
			int p = sc.nextInt();
			
			System.out.print("#" + tc + " ");
			
			for(int i = 0; i < p; i++) {
				int busStopNum = sc.nextInt();
				
				System.out.print(busStop[busStopNum] + " ");
			}
			System.out.println();
			
		
		}// tc
		
		
		
        sc.close();
        
    }//main
}//class