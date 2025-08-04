// import java.io.File;
// import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        // input 파일로부터 입력 받아오기
//        File file = new File("./src/main/java/input.txt");
//        Scanner sc = new Scanner(file); // 파일로 입력받을 거면 예외 던져줘야 함 throws FileNotFoundException

        // 스캐너로 입력받기
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 개수
        int T = sc.nextInt();


        for(int tc = 1; tc <= T; tc++) {

            int[] numbers = new int[10];

            for(int i = 0; i < numbers.length; i++) {
                numbers[i] = sc.nextInt();
            }

            Arrays.sort(numbers); // 정렬
            // 최소 수 - 인덱스[0]
            // 최대 수 - 인덱스[numbers.length - 1]

            double sum = 0; // sum 타입을 int -> double로 변경

            for(int i = 1; i < numbers.length - 1; i++) {
                sum += numbers[i];
            }

//            int avg = (sum / 8); // int 나누기 int는 int잖아

            // 소수점 첫째 자리에서 반올림한 정수 출력 -> 애초에 avg가 double이어야 함.
            // 그러려면 sum이 int가 아니라 double이어야 함
            double avg = (sum / 8);

            int answer = (int) Math.round(avg);
            System.out.println("#" + tc + " " + answer);

        }
    }
}
