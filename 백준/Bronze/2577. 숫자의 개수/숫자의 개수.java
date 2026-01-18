import java.util.*;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    int multiple = 1; // 곱해야 하니까 1
    
    for(int i = 0; i < 3; i++) {
      int num = sc.nextInt();
      multiple *= num;
    }
    
    // 카운팅 배열 선언
    int[] cnt = new int[10]; // 0 ~ 9

    // int -> String 변환
    String str = Integer.toString(multiple);

    // str 길이만큼 하나씩 뜯어서 카운팅배열++
    for(int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      int idx = ch - '0'; // char -> int 변환

      cnt[idx]++;
    }

    // System.out.println(Arrays.toString(cnt));

    for(int c : cnt) {
      System.out.println(c);
    }
    sc.close();
  }
}
