import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws FileNotFoundException {

//        File file = new File("./src/SWEA_1979_어디에_단어가_들어갈_수_있을까/input.txt");
//        Scanner sc = new Scanner(file);

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        // 테스트케이스 s
        for(int tc = 1; tc <= t; tc++) {
            int n = sc.nextInt(); // 퍼즐 크기 n*n
            int k = sc.nextInt(); // 찾아야 하는 단어의 길이

            // 퍼즐 배열 만들기
            int[][] puzzle = new int[n][n];

            // 퍼즐 값 입력받기
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    puzzle[i][j] = sc.nextInt();
                }
            }

            
            // 답 세기
            int answer = 0;
            
            // 가로로 찾아보기 (행 순회)
            // 연속된 1의 길이가 k 이어야 함
            // 앞이나 뒤나 1이 있으면 안됨
            // -> 경계거나 0으로 막혀있어야 됨!
            // 한 줄에서 1이 몇 개 연속하는지 세다가 연속이 끝났을 때 조건 확인
            for(int[] row : puzzle) { // 행 순회 (가로 한 줄씩 들어감)
            		int count = 0; // 한 줄마다 카운트 확인 필요
            		
            		for(int r : row) {
            			if (r == 1) {
            				count++;
            			} else {
            				if (count == k) {
            					answer++; // 정확히 k개 연속이면 정답 더하기
            				}
            				count = 0; // 초기화
            			}
            		}
            		
                // 이 로직이 있어서 11110 이런거 막을 수 있음!
                // 행 끝에 도달했을 떄 마지막 연속 1도 체크
            		if (count == k)
            			answer++;	
            } // 행 e
            
            // 열 순회(세로로 세기)

            for(int j = 0; j < n; j++) { // 열 순회
            		int count = 0;
            		for(int i = 0; i < n; i++) {
            			if(puzzle[i][j] == 1) {
            				count++;
            			} else { // 0 일 떄
            				if(count == k) {
            					answer++;
            				}
            				count = 0; // 초기화
            			}
            		} // 행 e
            		
            		// 한 열을 다 확인했을 때,
            		// 마지막이 k인지 확인해야 함
            		if(count == k) {
            			answer++;
            		}
            		
            } // 열 e

//            System.out.println(Arrays.deepToString(puzzle));
            System.out.println("#" + tc + " " + answer);


        } // 테스트케이스 e

    sc.close();
    
    } // main e
} // 클래스 e
