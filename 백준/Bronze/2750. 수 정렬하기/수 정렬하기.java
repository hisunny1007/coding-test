import java.util.Arrays;
import java.util.Scanner;

// 힙 정렬로 풀어보기
public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		// 힙 정렬
		heapSort(arr);
		
		// 결과 출력
		for(int num : arr) {
			System.out.println(num);
		}
		
		sc.close();
	}//
	
	// 힙 정렬
	public static void heapSort(int[] arr) {
		int n = arr.length;
		
		// 1. 최대 힙 구성
		for(int i = n / 2 - 1; i >= 0; i--) {
			heapify(arr, n, i);
		}
		
		// 2. 힙에서 하나씩 빼서 정렬
		for(int i = n - 1; i > 0; i--) {
			// 루트(최대값)와 마지막 요소 교환
			int tmp = arr[0];
			arr[0] = arr[i];
			arr[i] = tmp;
			
			// 힙 재구성
			heapify(arr, i , 0);
		}
	}
	
	// 힙 구성 함수
	public static void heapify(int[] arr, int n, int i) {
		int largest = i; // 루트
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		
		if(left < n && arr[left] > arr[largest]) largest = left;
		if(right < n && arr[right] > arr[largest]) largest = right;
		
		if(largest != i) {
			int swap = arr[i];
			arr[i] = arr[largest];
			arr[largest] = swap;
			
			heapify(arr, n, largest);
		}
	}
	
}//
