
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int[] dwarf = new int[9];
		
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			dwarf[i] = sc.nextInt();
			sum += dwarf[i];
		}
		// 9 난쟁이 키 합 140
				
		// 전체를 돌면서 두개씩 확인해. 그 두 개의 합을 뺴서 100이 나오면 끝
		
		for(int i = 0; i < 8; i++) {
			for(int j = i + 1; j < 9; j++) {// i 다음부터 끝까지
		        
				int heightSum = dwarf[i] + dwarf[j];
				
		        if (sum - heightSum == 100) {
		        	dwarf[i] = 0;
		        	dwarf[j] = 0;
		        	
		        	Arrays.sort(dwarf); // 0은 앞으로 나옴 [0, 0, 7, 8, 10, 13, 19, 20, 23]
		        	for(int k = 2; k < 9; k++) {
		        		System.out.println(dwarf[k]);			
		        	}
		        
		        	return; // 바로 종료함
		        }
		        
			}//
		}//
		
		sc.close();
		
	}// main e
}// class e
