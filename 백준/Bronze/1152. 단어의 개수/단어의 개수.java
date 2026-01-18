import java.util.*;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
  
    // ex. "  hello  world "
    // ["", "", "hello", "", "world", ""]
    // 공백으로 시작하거나 끝나는 경우는 제외해야 함 => trim으로 앞뒤 공백 제거

    // String str = sc.nextLine();
    // str = str.trim(); // 원본 바꾸지 않아서 다시 저장해야 함

    String str = sc.nextLine().trim();

    // 공백만 있는 경우는 -> 0임 (문자열 개수 세는 문제)
    if(str.isEmpty()) {
      System.out.println(0);
    } else {
      
      // String[] words = str.split(" ");  // 공백 1개 기준임
      // 1개 이상의 공백이 있는 데이터를 잘라내기 => .split("\\s+")
      String[] words = str.split("\\s+");
  
      System.out.println(words.length);
    }
    sc.close();
  }
}

