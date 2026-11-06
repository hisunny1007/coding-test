def solution(s):
    
    # 문자열은 정렬안되니까 리스트로 정렬
    arr = sorted(s, reverse=True)
    # 	['g', 'f', 'e', 'd', 'c', 'b', 'Z']
    
    answer = ''.join(arr)
    
    return answer