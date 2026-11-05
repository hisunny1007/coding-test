# def solution(arr):
#     answer = []
    
#     for num in arr:
#         if not answer or answer[-1] != num:
#             answer.append(num)
    
#     return answer

def solution(arr):
    answer = [arr[0]]
    
    for i in range(1, len(arr)):
        if arr[i] != arr[i-1]:
            answer.append(arr[i])
    return answer