def solution(arr):
    answer = [arr[0]] # 첫 번째 숫자 바로 넣고
    
    # 두 번째 숫자부터 검사
    for i in range(1, len(arr)):
        if arr[i] != arr[i-1]:
            answer.append(arr[i])
            
    return answer