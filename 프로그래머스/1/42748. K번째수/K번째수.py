# def solution(array, commands):
#     answer = []
    
#     for lst in commands:
#         i = lst[0]
#         j = lst[1]
#         k = lst[2]
        
#         # array를 i, j까지 슬라이싱
#         # 이때 원본 배열 바꾸면 안 됨!!
#         tmp = array[i - 1: j]
#         # 정렬
#         tmp.sort()
        
#         #k번째 수 구하기
#         answer.append(tmp[k-1])
        
#     return answer

# 언패킹 사용
def solution(array, commands):
    answer = []
    
    for i, j, k in commands:
        tmp = array[i-1:j]
        tmp.sort()
        answer.append(tmp[k-1])
    return answer