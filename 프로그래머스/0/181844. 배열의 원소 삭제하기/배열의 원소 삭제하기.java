import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
                        
        // arr배열을 순회함
        // 원소가 delete_list 배열의 원소랑 같으면 넘어가고
        // 다른 경우만 새로운 배열에 추가함
        
        // 자바의 기본 배열은 길이 고정돼있어 배열에서 요소 삭제 안됨
        // 자바에서 동적으로 배열에 값을 추가하고 싶다면?
        // -> 배열 대신 ArrayList 쓰자
        
        List<Integer> newList = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i ++) {
            boolean isDeleted = false;
            
            for(int j = 0; j < delete_list.length; j++) {
                if(arr[i] == delete_list[j]) {
                    isDeleted = true;
                    break;
                }
            }
            
            if(!isDeleted) {
                newList.add(arr[i]);
            }
        }
        
        // System.out.println(newList);
        
        // ArrayList -> 배열로 바꿔야 함
        int size = newList.size();
        
        int[] answer = new int[size];
        
        for(int i = 0; i < size; i++) {
            answer[i] = newList.get(i);
        }
        
        return answer;
        
        
    }
}