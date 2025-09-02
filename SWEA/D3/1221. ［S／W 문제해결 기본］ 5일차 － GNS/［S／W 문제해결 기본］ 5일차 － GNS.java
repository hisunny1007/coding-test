import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws FileNotFoundException {
		

		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
//		// 파이썬 딕셔너리처럼 키밸류값으로 넣어
		Map<String, Integer> map = new LinkedHashMap<>();
		
		// HashMap은 데이터 순서 보장x
		// TreeMap은 키값을 기준으로 자동정렬 (지금은 키값이 문자열이라 원하는 게 아님..)
		// HashMap의 순서를 보장하고 싶은 경우? -> LinkedHashMap!
		map.put("ZRO", 0);
		map.put("ONE", 1);
		map.put("TWO", 2);
		map.put("THR", 3);
		map.put("FOR", 4);
		map.put("FIV", 5);
		map.put("SIX", 6);
		map.put("SVN", 7);
		map.put("EGT", 8);
		map.put("NIN", 9);
//		System.out.println(map);
//		{FIV=5, NIN=9, SIX=6, EGT=8, ZRO=0, ONE=1, FOR=4, SVN=7, TWO=2, THR=3}

		for(int tc = 1; tc <= 10; tc++) {
			
			String tcNum = sc.next(); // #1
			int n = sc.nextInt(); // 7041
			
			// 카운팅 배열 
			int[] arr = new int[10];
			
			for(int i = 0; i < n; i++) {
				String str = sc.next();
				arr[map.get(str)]++; // map의 키값으로 벨류값을 가져옴. 카운팅 배열 원소값 ++
			}
			
//			System.out.println(map.keySet());
//			[ZRO, ONE, TWO, THR, FOR, FIV, SIX, SVN, EGT, NIN]

			StringBuilder sb = new StringBuilder();
			
			for(String s : map.keySet()) {
				for(int i = 0; i < arr[map.get(s)]; i++) {
					sb.append(s + " ");
				}
			}
			String result = sb.toString();
            System.out.printf("%s %s\n", tcNum, result);

		}//tc
		sc.close();
	}//main
}//class