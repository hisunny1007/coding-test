import java.util.*;

public class Main{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        // 성적 배열 만들고 입력
        double[] scores = new double[n];
        for(int i = 0; i < n; i++) {
            scores[i] = sc.nextInt();            
        }
        
        // 성적 배열에서 최대값 구하기
        double highScore = 0;
        for(int i = 0; i < n; i++) {
            if(scores[i] > highScore) highScore = scores[i];
        }
        
        // 새로운 평균 구하기
        double sum = 0;
        for(int i = 0; i < n; i++) {
            scores[i] = (scores[i]/highScore ) * 100;
            sum += scores[i];
        }
        
        double average = (sum / n);
        System.out.println(average);
        
        
       
        
        
        
    }
}