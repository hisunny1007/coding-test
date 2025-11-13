import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next();
		
		// 0그룹과 1그룹으로 나눔
		int count0 = 0;
		int count1 = 0;
		
		// 입력받은 문자열을 그룹별로 나눈 후, 가장 많이 나온 그룹으로 정답 구하기
		// ex. 0001100
		if(str.charAt(0) == '0') count0++;
		else count1++;
		
		for(int i = 1; i < str.length(); i++) {
			if(str.charAt(i) != str.charAt(i - 1)) {
				if(str.charAt(i) == '0') {
					count0++;
				} else {
					count1++;
				}
			}
		}
		
		int answer = Math.min(count0, count1);
		System.out.println(answer);
		
		sc.close();
		
	}
}