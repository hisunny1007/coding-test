import java.util.*;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
  
    int t = sc.nextInt();

    for(int tc = 0; tc < t; tc++) {
      int r = sc.nextInt(); // 각 문자를 r번 반복
      String str = sc.next();

      // 문자열은 배열처럼 접근 가능 (charAt(인덱스))
      // 1. 문자열 길이만큼 반복
      for(int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);

        // 2. 각 문자를 r번 반복
        for(int j = 0; j < r; j++) {
          System.out.print(c);
        }
      }
      // tc 줄바꿈
      System.out.println();
    }
      
    sc.close();
  }
}