# def solution(n):
#     result = map(int,str(n))
#     return sum(result)

def solution(n):
    answer = 0
    
    # str(n): 정수를 문자열로 바꿔 한 자리씩 꺼낼 수 있음
    for ch in str(n):
        answer += int(ch)
        # 꺼낸 문자를 다시 정수로 변환해서 합계에 더함
        
    return answer
        
        