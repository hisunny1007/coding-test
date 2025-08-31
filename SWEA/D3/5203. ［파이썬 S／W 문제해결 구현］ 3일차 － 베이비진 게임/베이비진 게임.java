package SWEA_5203_베이비진_게임;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt(); 
		
		
		for(int tc = 1; tc <= t; tc++) {
			
			// 카드배열 입력받기
			int[] arr = new int[12];
			for(int i = 0; i < 12; i++) {
				arr[i] = sc.nextInt();
			}//
			
			// 카운팅 배열 만들기 (길이 10짜리 배열로 숫자별 보유 개수 셈)
			// p1[3] == 2이면 플레이어1이 숫자3을 두 장 가지고 있음
			
			int[] p1 = new int[10]; // 플레이어1의 카드 카운트(0~9)
	        int[] p2 = new int[10]; // 플레이어2의 카드 카운트(0~9)
	        int result = 0;        // 결과: 0 = 무승부, 1 = p1 승, 2 = p2 승			
			
	         
	        for(int i = 0; i < 12; i++) {
	        	 int card = arr[i];
	        	 if(i % 2 == 0) { // 짝수 인덱스는 player1 카드 (0인덱스부터 시작이니까)
	        		 p1[card]++; // 해당 숫자 카운트 증가
	        		 
	        		 if(isWin(p1)) { // 뽑자마자 판정
	        			 result = 1;
	        			 break; // 즉시승리 -> 더이상 진행x
	        		 }
	        	 } else { // 홀수 인덱스는 player2카드
	        		 p2[card]++;
	        		 
	        		 if(isWin(p2)) {
	        			 result = 2;
	        			 break;
	        		 } 
	        	 }
	         }// for
			
	        System.out.printf("#%d %d\n", tc, result);
		}//tc
		
		sc.close();
	}//main
	
    // 현재 카운팅 배열이 triplet 또는 run을 포함하면 true 반환
	public static boolean isWin(int[] cnt) {
		// triple 검사: 어떤 숫자가 3개 이상이면 승리
		for(int i = 0; i < 10; i++) {
			if(cnt[i] >= 3) {
				return true;
			}
		}
		
		// run 검사 : 연속된 세 숫자(i, i+1, i+2)가 모두 존재하면 승리
		for(int i = 0; i <=7; i++) {
			if(cnt[i] > 0 && cnt[i+1] > 0 && cnt[i+2] > 0) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
}//class
