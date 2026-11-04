def solution(arr):
    answer = []
    
    for num in arr:
        # 첫 번째는 넣기 위해 비어있지 않거나 조건 + 마지막 숫자가 
        if not answer or answer[-1] != num:
            answer.append(num)
            
    return answer