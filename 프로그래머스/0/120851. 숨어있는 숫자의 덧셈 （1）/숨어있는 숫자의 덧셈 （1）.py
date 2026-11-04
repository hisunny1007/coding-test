def solution(my_string):
    answer = 0
    
    for ch in my_string:
        if ch.isdigit(): # 숫자 문자라면? # True / False
            answer += int(ch) # 숫자 문자열을 정수로 변환
    return answer