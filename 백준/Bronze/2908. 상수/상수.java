import java.util.*;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int max = 0;

    // 문자열로 받기
    for(int i = 0; i < 2; i++) {
      String str = sc.next();

      StringBuilder sb = new StringBuilder(str);
      // sb.append(str);
      
      String reversed = sb.reverse().toString();
      
      int num = Integer.parseInt(reversed); // string -> int
      
      if(num > max) {
        max = num;
      }
    }

    System.out.println(max);

    sc.close();
  }
}