import java.util.*;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int t = sc.nextInt();
    
    for(int tc = 0; tc < t; tc++) {
      String str = sc.next();
      
      int cnt = 0;
      int sum = 0;

      for(int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);

        if(ch == 'O') {
          cnt++;
          sum += cnt;
        } else {
          cnt = 0;
        }
      }
      System.out.println(sum);
    }

    sc.close();
  }
}