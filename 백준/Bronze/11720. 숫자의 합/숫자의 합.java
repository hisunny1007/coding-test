import java.util.*;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    String str = sc.next();

    int sum = 0;

    // str.length() = n
    for(int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      int num = ch - '0';
      
      sum += num;
    }
    
    System.out.println(sum);
    sc.close();
  }
}