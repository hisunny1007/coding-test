def solution(order):
    answer = 0
    
    for o in str(order):  # 문자열 변환
        # if o == "3" or o == "6" or o == "9": 
        if o in "369":
            answer += 1
    return answer