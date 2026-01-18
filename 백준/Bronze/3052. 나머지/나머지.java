import java.util.*;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // 카운팅 배열
    int[] cntArr = new int[42]; // 42로 나눴을 때 나머지는 41까지 나올 수 있음 (0~41)

    for(int i = 0; i < 10; i++) {
      int num = sc.nextInt();
      int idx = num % 42;
      cntArr[idx]++;
    }
    
    // 배열에서 다른 원소 개수 찾기
    // 이미 각자 나머지에 맞는 곳에서 ++ 했기 때문에 0이 아니면 다른 원소 개수
    int cnt = 0;

    for(int i = 0; i < cntArr.length; i++) {
      if(cntArr[i] > 0) {
        cnt++;
      }
    }
    System.out.println(cnt);
    sc.close();
  }
}