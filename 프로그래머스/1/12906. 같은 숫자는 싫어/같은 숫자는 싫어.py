def solution(arr):
    answer = []
    
    # 앞서 저장한 마지막 값과 비교
    for num in arr:
        # 빈 리스트라면 첫 번째 넣고
        # 마지막 원소가 현재 숫자랑 다를 떄 넣고
        # => 연속 중복 제거
        if not answer or answer[-1] != num:
            answer.append(num)
            
    return answer