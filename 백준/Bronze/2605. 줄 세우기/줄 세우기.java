import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		// n명 학생 리스트
		List<Integer> list = new ArrayList<>();
		
		for(int i = 1; i <= n; i++) {
			int num = sc.nextInt();
			
			// 뽑은 숫자만큼 앞으로
			// 0이면 제자리, 1이면 앞으로 한 칸, 2면 앞으로 두 칸,,,
			int idx = list.size() - num;
			
			list.add(idx, i);
			
		}
		
		for(int x : list) {
			System.out.print(x + " ");
		}

		sc.close();
	}
}
