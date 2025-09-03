import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n]; // 0 ~ 9


        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        
        int increaseLength = 1;
        // 최소 길이 1부터 시작
        int maxIncrease = 1; // 연속해서 커질 때 최대

        // 1.연속 증가 수열 계산
        // 연속해서 커지거나(같은 것 포함) - 최대 길이 출력
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] <= arr[i + 1]) {
            	increaseLength++;
                maxIncrease = Math.max(maxIncrease, increaseLength); // 최대값 갱신
            } else {
            	increaseLength = 1; // 다시 초기화
            }

        }
        
        // 카운트 다르게 선언해줘야 함
        int decreaseLength = 1;
        // 최소 길이 1부터 시작
        int maxDecrease = 1; // 연속해서 작아질 때 최대

        // 2. 연속 감소 수열 계산
        // 연속해서 작아지거나(같은 것 포함 - 최대 길이 출력
        for(int i = 0; i < n - 1; i++) {
            if(arr[i] >= arr[i + 1]) {
            	decreaseLength++;
                maxDecrease = Math.max(maxDecrease, decreaseLength); // 최대값 갱신
            } else {
            	decreaseLength = 1;
            }
        }

    
	    // 3. 연속해서 커지거나(같은 것 포함), 혹은 연속해서 작아지는(같은 것 포함) 수열 중 가장 길이가 긴 것을 찾아내어 그 길이를 출력
	    int answer = Math.max(maxIncrease, maxDecrease);
	    System.out.println(answer);

    
	    sc.close();
    }//
}//
