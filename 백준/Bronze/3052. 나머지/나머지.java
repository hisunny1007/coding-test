import java.util.*;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    // 서로 다른 값이 몇 개 있는지 (중복 x)
    Set<Integer> set = new HashSet<>();

    for(int i = 0; i < 10; i++) {
      int num = sc.nextInt();

      set.add(num % 42); // 나머지 다른 것만 set에 추가
    }
    
    System.out.println(set.size());
    sc.close();
  }
}