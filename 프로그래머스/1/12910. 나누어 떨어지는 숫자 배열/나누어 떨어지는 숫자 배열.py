def solution(arr, divisor):
    answer = []
    
    for num in arr:
        if num % divisor == 0:
            answer.append(num)
            
    # 만약에 하나도 안 나눠떨어진다면? answer은 아직 빈 리스트
    if not answer: # 빈 리스트인가?
        return [-1]
    
    answer.sort()
    return answer