import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 상품 가격
		int price = sc.nextInt();
		
		// 받아야할 돈
		int num = 1000 - price;
		// 잔돈 배열
		int[] coins = {500, 100, 50, 10, 5, 1};
		
		// 언제나 거스름돈 개수가 가장 적게 잔돈을 준다
		// => 최소 개수를 구하기 위해서는 가장 큰 화폐 단위부터 돈을 거슬러 준다(500부터)
		
		int cnt = 0;
		
		for(int coin : coins) {
			cnt += (num / coin);
			num %= coin;
		}
		
		System.out.println(cnt);
		sc.close();
	}
}