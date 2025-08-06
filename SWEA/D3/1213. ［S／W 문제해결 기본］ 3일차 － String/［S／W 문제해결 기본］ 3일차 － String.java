import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
//		File file = new File("test_input.txt");
//		Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		
		int T = 10;		
		

		for(int tc = 1; tc <= T; tc++) {
			int tcNum = sc.nextInt();
			String findStr = sc.next();
			String lineStr = sc.next();
			
			// 문자열에서 특정 문자열의 개수를 반환
			int count = 0;
			int index = lineStr.indexOf(findStr, 0); // 처음 찾은 위치 인덱스
			
			
			// 이거는 그냥 한번 있으면 바로 true 하고 끝인 거 같은데.. 어떻게 하지?
//			if(lineStr.contains(findStr)) {
//				count++;
//				System.out.println("#" + tcNum + " " + count);
//			}
			
			
			// lineStr에 findStr이 없을 때까지 반복
			while( index != -1) { // .indexOf는 없을 때 -1 반환하기 때문
				count++;
				// 이제 다음 위치로 가야됨
				index = lineStr.indexOf(findStr, index + findStr.length());
			}
			
			System.out.println("#" + tcNum + " " + count);
			
			 
			
		}
		
	}
	
}

		// 문자열에서 중복 없이, 겹치지 않게 특정 문자열이 몇 번 등장하는지 세고 싶을 때는:

		
//		.indexOf(sub, fromIndex)  원하는 문자열이 시작되는 위치를 반환
//		sub 문자열이 fromIndex부터 어디서 처음 나오는지 찾음 (없으면 -1 리턴)
		
//		String findStr = "apple";
//		String lineStr = "bbapplejuiceapplepieapple";
//		System.out.println(lineStr.indexOf(findStr, index)); // 2 (없으면 -1 리턴)

		
//		int count = 0;
//		int index = lineStr.indexOf(findStr, 0); // 처음 찾은 위치 반환
//		
//		// findStr의 처음 위치 있으면
//		while ( index != -1) {
//		    System.out.println("찾은 위치: " + index);
//			count++; // 개수 늘리고
//			
//			// 다음 위치에서 다시 찾아야 함.
//			
//			index = lineStr.indexOf(findStr, index + findStr.length()); // 다음 위치로 이동
//		    System.out.println("다음 검색 시작 위치: " + index);
//
//		}
//
//		System.out.println("총개수 "  + count);


