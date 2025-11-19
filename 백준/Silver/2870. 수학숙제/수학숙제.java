import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		// 숫자 임시 저장함
		StringBuilder sb = new StringBuilder(); // 지금 읽고 있는 숫자들 임시로 모아둔 변수
		
		//숫자 만나면 → StringBuilder에 추가
		//문자 만나면 → 지금까지 모은 숫자를 리스트에 저장하고 초기화
		//문자열 끝나면 → 남은 숫자 처리
		
		// 모아둔 숫자를 저장
		List<String> numbers = new ArrayList<>();
		
		// 테스트케이스
		for(int tc = 0; tc < t; tc++) {
			String str = sc.next();
			
			// 문자는 문자끼리, 숫자는 숫자끼리 덩어리로 묶어야 함..
			for(int i = 0; i < str.length(); i++) {
				char ch = str.charAt(i);
				
				// 입력받은 문자열이 숫자인지 확인
				if(Character.isDigit(ch)) {
					// 숫자면 sb에 넣기
					sb.append(ch); 
				} else { // 문자라면
					// 지금까지 sb에 모은 숫자를 결과에 넣음
					// 바로 list.add 하면 sb에 아무것도 없는 경우 빈 문자열이 들어감
					if(sb.length() > 0) { // sb에 숫자 하나라도 들어있을 때만 (조건 필요)
//						numbers.add(sb.toString());
						
						// BigInteger 거치면 내부적으로 자동으로 앞의 0 제거됨!
						BigInteger bi = new BigInteger(sb.toString());
						numbers.add(bi.toString());
						
						
						sb.setLength(0); // sb 비우기 - 초기화 메서드
//						sb = new StringBuilder(); 로 새로 만들어도 되지만 비우는게 깔끔
					}
				}
			}
			
			// 문자열이 숫자로 끝났을 때 처리 해줘야 함!!
			if(sb.length() > 0) {
				BigInteger bi = new BigInteger(sb.toString());
				numbers.add(bi.toString());
				sb.setLength(0);
			}
			
		}
		// 문자열 정렬이 아니라 수의 크기로 정렬해야 함
//		Collections.sort(numbers); // [0, 2, 2, 231233, 43]

		// BigInteger로 비교하면서 정렬 (원소 a랑 b 비교 )
		// a < b이면 음수 반환(a가 앞) / a== b이면 0 반환 / a > b이면 양수 반환(b가 앞)
		Collections.sort(numbers, (a, b) -> {
		    return new BigInteger(a).compareTo(new BigInteger(b));
		});
		
		for(String num : numbers) {
			System.out.println(num);
		}
		sc.close();
	}
}

// 2b34 이런 문자열이 예를 들어 있다고 쳐.
// 그럼 a , 2, b, 34 이렇게 나누고 싶거든? 문자는 문자, 숫자는 숫자끼리!
// 뭔가 자바 문자열 자르기 indexof split substring 다 찾아봐도 아닌 거 같은데어떻게 하면 좋을까

// -> 문자열을 한 글자씩 확인하면서
// Character.isDigit(c) 메서드로 숫자인지 체크 -> 연속된 숫자들을 모아서 하나의 수로 만들기
//StringBuilder로 숫자를 임시 저장
