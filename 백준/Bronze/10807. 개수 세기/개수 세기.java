import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // 정수 개수 n
        int n = sc.nextInt();
        // 입력 배열
        int[] num = new int[n];

        for(int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        // 찾으려고 하는 정수 v
        int v = sc.nextInt();
        // 개수 변수
        int cnt = 0;

        for(int i = 0; i < num.length; i++) {
            if(num[i] == v)
                cnt++;
        }

        System.out.println(cnt);
        
 
    }
}