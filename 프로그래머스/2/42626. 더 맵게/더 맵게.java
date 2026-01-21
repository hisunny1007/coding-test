import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
       
        // 1. 우선순위 큐 생성 및 데이터 삽입
       Queue<Integer> pq = new PriorityQueue<>();
        // 들어온 순서와 상관없이 가장 작은 값(낮은 숫자)을 항상 맨 앞(peek)에 배치
        
        for(int s : scoville) {
            pq.offer(s); // (모든 음식 큐에 넣음 - 자동으로 작은 순 정렬됨)
        }
        
        int count = 0;
        while(pq.peek() < K) {
            if(pq.size() < 2) return -1;
            pq.offer(pq.poll() + pq.poll() * 2);
            count++;
        }
        return count;
        
    }
}