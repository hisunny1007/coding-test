def solution(n):
    # 12345 -> [5, 4, 3, 2, 1]
    # 숫자 -> 문자열 -> 리스트로 쪼갬
    str_list = list(str(n)) # ["1","2","3","4","5"]
    reversed_list = str_list[::-1] # ["5","4","3","2","1"]
    
    # 문자열 숫자를 int로 변환함
    # answer = []
    # for num in reversed_list:
    #     answer.append(int(num))
    
    # 리스트 컴프리헨션 사용
    answer = [int(num) for num in reversed_list]
    
    return answer