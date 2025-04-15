def solution(a, b):
    answer = 0
    # a와 b의 대소관계는 정해져있지 않음 -> 조건 잘 읽어
    # for i in range(a, b+1):
    #     answer += i
    # return answer
    
    start = min(a, b)
    end = max(a, b)
    
    for i in range(start, end+1):
        answer += i
    return answer