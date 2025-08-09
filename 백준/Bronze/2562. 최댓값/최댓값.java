import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // 최댓값 변수
        int max = 0;
        // 최댓값 위치 (인덱스) 변수
        int maxIndex = 0;
        
        // 1번째부터 시작하니까 i = 1부터
        for(int i = 1; i <= 9; i++){
            int num = sc.nextInt();
            
            if(num > max) {
                max = num;
                maxIndex = i; // 조건에 i = 0 이면 maxIndex = i + 1;
            }
        }
        
        System.out.println(max);
        System.out.println(maxIndex);
    }
}