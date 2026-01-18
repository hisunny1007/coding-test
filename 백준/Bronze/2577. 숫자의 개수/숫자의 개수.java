import java.util.*;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    int number = a * b * c;

    String word = Integer.toString(number); // int -> String 변환
    int[] answer = new int[10]; // 0 ~ 9 카운팅 배열

    for(int i = 0; i < word.length(); i++) {
      
      char ch = word.charAt(i);
      int num = ch - '0'; // char -> int 형 변환

      // 0~9에서 비교해야 함
      for(int j = 0; j <= 9; j++) {
        if(num == j) {
          answer[j]++;
        }
      }
    }
    
    // 정답 출력
    for(int ans : answer) {
      System.out.println(ans);
    }
    sc.close();
  }
}