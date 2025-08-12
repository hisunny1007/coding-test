import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) throws FileNotFoundException {
		// 3시 50분
//		File file = new File("./src/SWEA_7102_준홍이의_카드놀이/sample_input.txt");
//		Scanner sc = new Scanner(file);
		Scanner sc = new Scanner(System.in);
		
		int t = sc.nextInt();
		
		for(int tc = 1; tc <= t; tc++) {
		
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			int sum = 0;
			
			// 해시맵 활용 (키밸류값 구하기 위해)
			Map<Integer, Integer> map = new HashMap<>();
			
			int count = 0;

			for(int i = 1; i < n + 1; i++) {
				for(int j = 1; j < m + 1; j++) {
					// count이 반복문 밖에 있으니까 .. 누적합이 된다..
					// 키값(sum)에 관계없이 밸류(count)가 누적되고 있음 ;;
					sum = i + j;
//					count++; // 모든 쌍에서 ++하고 있음 .. ; 특정 sum일 때 count해야돼
//					// sum을 키값으로, count를 밸류값으로
//					map.put(sum, count);
					
					// (원래 있던 특정 키 값의 밸류값에) 더해야 한다!!!!!!!!
					// 키가 있으면 ... 거기에 있던 밸류값에 +1
					// 키가 없으면 새롭게 만든 키를 넣어줘.. 그리고 밸류값을 1 (새로운 거니까)
					
					// sum이 있으면 +1, 없으면 0
					map.put(sum, map.getOrDefault(sum, 0) + 1);
					
				}
			}
//			System.out.println(map);
//			{2=1, 3=2, 4=3, 5=4, 6=5, 7=6, 8=5, 9=4, 10=3, 11=2, 12=1}
//			{2=1, 3=2, 4=3, 5=4, 6=4, 7=4, 8=3, 9=2, 10=1}
			
			// 등장할 확률이 가장 높은 숫자 구하기
			// value값이 가장 큰 key값 출력!
			int max = Integer.MIN_VALUE;
			
//			System.out.println(map.values());
//			[1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1]
//			[1, 2, 3, 4, 4, 4, 3, 2, 1]
			
			for(int v : map.values()) {
				if ( v > max ) {
					max = v;
				}
			}
			
			// max값과 같은 value를 가진 key 출력
			System.out.print("#" + tc + " ");
			for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			    if (entry.getValue() == max) {
			        System.out.print(entry.getKey() + " ");
			    }
			}
			System.out.println();
			
		}
		
		sc.close();
		
	} // 메인 e
} // 클래스 e
