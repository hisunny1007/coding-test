import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Solution {
    public static void main(String[] args) throws FileNotFoundException {

        // input 파일로부터 입력 받아오기
//        File file = new File("./src/main/java/input.txt");
//        Scanner sc = new Scanner(file); // 파일로 입력받을 거면 예외 던져줘야 함 throws FileNotFoundException

        // 스캐너로 입력받기
        Scanner sc = new Scanner(System.in);

        // 테스트 케이스 개수
        int T = sc.nextInt();

        // 가장 큰 수
//        int maxNum = 0; // 매 테스트케이스마다 새롭게 초기화해줘야 됨!!!
        // 1번, 2번 테케는 맞고 3번만 틀렸는데 2번 테케는 우연히 맞은거임..
//        #1 99
//        #2 123
//        #3 123


        for(int tc = 1; tc <= T; tc++) {
            int maxNum = 0; // 매 테케마다 초기화해줘야 함

            for (int j = 1; j <= 10; j++) {
                int inputNum = sc.nextInt();

                if (inputNum > maxNum) {
                    maxNum = inputNum;
                }
            }
            // 위치가 조금 헷갈렸음 맨 바깥 for문 벗어나서 출력하니까 마지막 테케 밖에 안 나와서 조정
            System.out.println("#" + tc + " " + maxNum);

        }
    }
}
