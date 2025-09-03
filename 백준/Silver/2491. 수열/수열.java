
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n]; // 0 ~ 9


        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }


        
        int currentLength = 1; // 현재 연속 길이
        int maxLength = 1;     // 최대 연속 길이

        // 1.연속 증가 수열 계산
        // 연속해서 커지거나(같은 것 포함) - 최대 길이 출력
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] <= arr[i + 1]) {
            	currentLength++;
            	maxLength = Math.max(maxLength, currentLength); // 최대값 갱신
            } else {
            	currentLength = 1; // 다시 초기화
            }

        }

        
        // 재사용전 초기화
        currentLength = 1;
        
        // 2. 연속 감소 수열 계산
        // 연속해서 작아지거나(같은 것 포함 - 최대 길이 출력
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] >= arr[i + 1]) {
            	currentLength++;
            	maxLength = Math.max(maxLength, currentLength); // 최대값 갱신
            } else {
            	currentLength = 1;
            }
        }

    
	    // 3. 연속해서 커지거나(같은 것 포함), 혹은 연속해서 작아지는(같은 것 포함) 수열 중 가장 길이가 긴 것을 찾아내어 그 길이를 출력
	    // int answer = Math.max(maxLength, maxDecrease);
	    System.out.println(maxLength); // 하나의 변수에 갱신

    
    sc.close();
    }//
}//
