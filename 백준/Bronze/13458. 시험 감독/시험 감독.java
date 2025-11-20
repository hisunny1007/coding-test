import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
	
		int[] students = new int[n];
		
		for(int i = 0; i < n; i++) {
			students[i] = sc.nextInt();
		}
		
		int mainT = sc.nextInt();
		int subT = sc.nextInt();
		
		// n 범위 최대여서 범위 넘어갈 수도 있음
		long sum = 0;
		
		for(int i = 0; i < n; i++) {
			// main감독관은 교실마다 1명 (무조건 배치해야 함)
			sum++; // 필수로 증가
			
			int leftStudent = students[i] - mainT;
			
//			남은 학생 수 / subT   → 나누어 떨어지면 그 몫
//			남은 학생 수 / subT + 1 → 나머지가 있으면
			
			// 남은 학생이 있을 때만 서브감독관 배치함
			if(leftStudent > 0) {
				if(leftStudent % subT == 0) { // 나누어 떨어지면 그 몫만큼 추가감독관 필요
					sum += leftStudent / subT;
				} else { // 나머지가 있다면 그 몫에서 +1 만큼 필요함
					sum += (leftStudent / subT) + 1;
				}				
			}
		}
		
		System.out.println(sum);
		
		sc.close();
	}
}