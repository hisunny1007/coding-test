import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    static int n; // 전체 원소 개수
    static int m; // 뽑을 원소 개수
    static int[] arr; // n개의 원소를 가진 배열
    static int[] result; // m개의 원소를 담을 배열
    static Stack<Integer> resultStack;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		arr = new int[n];
		result = new int[m];
		resultStack = new Stack<>();
		
        for (int i = 0; i < n; i++) {
            arr[i] = i + 1; // 1부터 n까지 채움
        }

        combination(0, 0); // start=0, count=0 부터 시작
        sc.close();
	}
	

//	1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
//	고른 수열은 오름차순이어야 한다.
	// => 조합
	
	// start : 이번에 선택을 시작할 원소의 인덱스
    // count : 현재까지 뽑은 원소 개수
    public static void combination(int start, int count) {
        // 종료 조건
        if (count == m) {
//            System.out.println(Arrays.toString(result));
			for(int num : resultStack) {
				System.out.print(num + " ");
			}
			System.out.println();
			return; // 끝내기
        }

//        // start부터 n-1까지 반복 (중복 제거 효과)
//        for (int i = start; i < n; i++) {
//            result[count] = arr[i]; // 현재 원소 선택
//            combination(count + 1, i + 1); // 다음 원소 뽑으러 감
//        }
        
        // 스택이라면
        for(int i = start; i < n; i++) {
        	resultStack.push(arr[i]); // 선택
        	combination(i + 1, count + 1); // 다음 위치부터 탐색
        	resultStack.pop(); // 선택 취소
        }
    }
}
