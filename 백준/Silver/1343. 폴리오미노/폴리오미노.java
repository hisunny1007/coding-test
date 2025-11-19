import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		// 정답을 담을 변수
		StringBuilder sb = new StringBuilder();
		
		int cnt = 0;
		
		for(int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			
			
			if(c == 'X') {
				cnt++;
			} else { // '.'을 만났으면 그 앞에 잇던 x 처리해줘야함
				// 홀수면 -1 출력
				if(cnt % 2 == 1) {
					System.out.println(-1);
					return; // 
				} 
				// 짝수면 AAAA, BB 써줘야 함
				// 4개 이상일 때 // 조건 분기를 해줘야 함
//				if(cnt == 4) {
//					sb.append("AAAA");					
//				} else if(cnt == 2) {
//					sb.append("BB");
//				}

		        sb.append("AAAA".repeat(cnt / 4));
		        sb.append("BB".repeat((cnt % 4) / 2));
		        sb.append(".");
		        
		        cnt = 0;
			}
		}
		
		// 그리고 나머지 뒷부분
		if (cnt % 2 == 1) {
		    System.out.println(-1);
		    return;
		}
		
		sb.append("AAAA".repeat(cnt / 4));
		sb.append("BB".repeat((cnt % 4) / 2));
		
		System.out.println(sb);
		
		sc.close();
	}
}